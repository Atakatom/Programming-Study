import java.util.Random;
import java.util.Scanner;

public class Board {
    public static final int x = 1, o = -1, e = 0;
    private int[][] board = new int[3][3];
    private int player = x;

    public Board() {
        System.out.println("Welcome to the TICTACTOE");
        System.out.println("Your are x");
        clearBoard();
    }

    public void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = e;
            }
        }
    }

    public int winner() {
        if (isWin(x))
            return x;
        if (isWin(o))
            return o;
        return 0;
    }

    public Board cloneBoard() {
        Board newer = new Board();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newer.board[i][j] = board[i][j];
            }
        }
        newer.player = this.player;
        return newer;
    }

    public void calculateComputerMove() {
        System.out.println("Bilgisayarin hamlesini hesapliyorum...");
        Board b = cloneBoard();
        System.out.println("All possible moves");
        int n = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == e) {
                    System.out.println("possible move: " + n++);
                    board[i][j] = o;
                    System.out.println(toString());
                    board[i][j] = e;
                }
            }
        }

    }

    public void move(int row, int column) throws IllegalArgumentException {
        if ((row < 0) || (row > 2) || (column < 0) || (column > 2))
            throw new IllegalArgumentException("Invalid board position");
        if (board[row][column] != e)
            throw new IllegalArgumentException("Board position occupied");
        boolean doWeHaveAWinner = false;
        board[row][column] = x;
        doWeHaveAWinner = isWin(x);
        // if (doWeHaveAWinner) {
        // System.out.println("YOU ARE THE WINNER!");
        // } else {
        // turnOfComputer();
        // doWeHaveAWinner = isWin(o);
        // if (doWeHaveAWinner) {
        // System.out.println("YOU LOST!");
        // }
        // }
    }

    public void turnOfComputer() {
        int i = 0, j = 0;
        do {
            Random rand = new Random();
            i = rand.nextInt(3);
            j = rand.nextInt(3);
            if (board[i][j] == e)
                board[i][j] = o;
        } while (board[i][j] != o);
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
                sb.append("------\n");
        }
        return sb.toString();
    }
}

class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Board game = new Board();
        game.clearBoard();
        int i, j;
        while (game.winner() == 0) {
            System.out.println("Where would you like to put X?");
            System.out.print("row: ");
            i = input.nextInt() - 1;
            System.out.print("column: ");
            j = input.nextInt() - 1;
            game.move(i, j);
            game.calculateComputerMove();
            System.out.println(game.toString());
        }
        input.close();
    }
}