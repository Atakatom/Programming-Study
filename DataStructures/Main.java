package DataStructures;

public class Main {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.putMark(0, 0);
        t.putMark(0, 1);
        t.putMark(0, 2);
        t.putMark(1, 0);
        t.putMark(1, 1);
        t.putMark(1, 2);
        t.putMark(2, 0);
        t.putMark(2, 1);
        t.putMark(2, 2);
        System.out.println(t);
        int winningPlayer = t.winner();
        String[] outcome = { "O wins", "Tie", "X wins" };
        System.out.println(outcome[1 + winningPlayer]);
    }
}
