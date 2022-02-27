
public class TicTacToe {
    public static final int x = 1, o = -1, e = 0;
    private int[][] board = new int[3][3];
    private int player;

    public TicTacToe() {
        this.player = x;
    }

    public void putMark(int i, int j) throws IllegalArgumentException {
        if ((i < 0 || i > board.length) || (j < 0 || j > board[0].length))
            throw new IllegalArgumentException("Invalid board position");
        if (board[i][j] != e)
            throw new IllegalArgumentException("Board position occupied");
        board[i][j] = player;
        player = -1;

    }

    public void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = e;
            }
        }
        this.player = x;
    }

    public int winner() {
        if (isWin(x))
            return x;
        if (isWin(o))
            return o;
        return 0;
    }

    public boolean isWin(int player) {
        return ((board[0][0] + board[0][1] + board[0][2] == player * 3)
                || (board[1][0] + board[1][1] + board[1][2] == player * 3)
                || (board[2][0] + board[2][1] + board[2][2] == player * 3)
                || (board[0][0] + board[1][0] + board[2][0] == player * 3)
                || (board[1][0] + board[1][1] + board[1][2] == player * 3)
                || (board[2][0] + board[2][1] + board[2][2] == player * 3)
                || (board[0][0] + board[1][1] + board[2][2] == player * 3));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                switch (board[i][j]) {
                case x:
                    sb.append("X");
                    break;
                case o:
                    sb.append("O");
                    break;
                case e:
                    sb.append(" ");

                }
                if (j < 2)
                    sb.append("|");
            }
            sb.append("\n");
            if (i < 2)
                sb.append("|");
        }
        return sb.toString();
    }
}
