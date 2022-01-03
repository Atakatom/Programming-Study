
// /**
// * @author Atakan Yontar
// * @schoolNo 20150807041
// */

// import java.util.ArrayList;
// import java.util.Random;
// import java.util.Scanner;

// public class Board {
// public static final int x = 1, o = -1, e = 0;
// private int[][] boardArray = new int[3][3];
// private int player = x;
// private ArrayList<Board> children;
// public Board parent;
// public int countX = 0, countO = 0;

// public Board() {
// children = new ArrayList<>(9);
// clearBoard();
// }

// public ArrayList<Board> getChildren() {
// return this.children;
// }

// public void calculateComputerMove() {
// this.children.clear();
// for (int i = 0; i < boardArray.length; i++) {
// for (int j = 0; boardArray[0].length < 3; j++) {
// if (boardArray[i][j] == e) {
// Board tic = this.cloneBoard();
// tic.parent = this;
// try{
// tic.putMark(i, j);
// this.children.add(tic);
// int winner = tic.winner();
// if (winner == e)
// tic.calculateComputerMove();
// else {
// if (winner == x) {
// temp.countX++;
// } else {
// temp.countO++;
// }
// Board temp = tic;
// while (temp.parent != null) {
// temp = temp.parent;
// if (winner == x) {
// temp.countX++;
// } else {
// temp.countO++;
// }
// }
// }
// } catch (Exception e){}
// }
// }
// }

// }

// public void printTree() {
// if (this.winner() != 0)
// this.printBoard();
// for (Board child : this.children) {
// child.printTree();
// }
// }

// public void putMark(int row, int column) throws IllegalArgumentException {
// if ((row < 0) || (row > 2) || (column < 0) || (column > 2))
// throw new IllegalArgumentException("Invalid board position");
// if (boardArray[row][column] != e)
// throw new IllegalArgumentException("Board position occupied");
// boardArray[row][column] = player;
// player = -player;
// }

// public void clearBoard() {
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < boardArray[0].length; j++) {
// boardArray[i][j] = e;
// }
// }
// }

// public int winner() {
// if (isWin(x))
// return x;
// if (isWin(o))
// return o;
// return 0;
// }

// public Board cloneBoard() {
// Board newer = new Board();
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 3; j++) {
// newer.boardArray[i][j] = boardArray[i][j];
// }
// }
// newer.player = this.player;
// return newer;
// }

// public void turnOfComputer() {
// int i = 0, j = 0;
// do {
// Random rand = new Random();
// i = rand.nextInt(3);
// j = rand.nextInt(3);
// if (boardArray[i][j] == e)
// boardArray[i][j] = o;
// } while (boardArray[i][j] != o);
// }

// public boolean isWin(int player) {
// return ((boardArray[0][0] + boardArray[0][1] + boardArray[0][2] == player *
// 3)
// || (boardArray[1][0] + boardArray[1][1] + boardArray[1][2] == player * 3)
// || (boardArray[2][0] + boardArray[2][1] + boardArray[2][2] == player * 3)
// || (boardArray[0][0] + boardArray[1][0] + boardArray[2][0] == player * 3)
// || (boardArray[1][0] + boardArray[1][1] + boardArray[1][2] == player * 3)
// || (boardArray[2][0] + boardArray[2][1] + boardArray[2][2] == player * 3)
// || (boardArray[0][0] + boardArray[1][1] + boardArray[2][2] == player * 3));
// }

// public void getPlayerMove() throws IllegalAccessException {
// int i, j;
// do {
// Scanner s = new Scanner(System.in);
// System.out.print("Please enter i = ");
// i = s.nextInt();
// System.out.print("Please enter j = ");
// j = s.nextInt();
// } while (i < 0 || i > 2 || j < 0 || j > 2 || (boardArray[i][j] != EMPTY));

// putMark(i, j);
// }

// public void printBoard() {
// for (int i = 0; i < boardArray.length; i++) {
// for (int j = 0; j < boardArray[0].length; j++) {
// if (boardArray[i][j] == 1)
// System.out.print("X ");
// else if (boardArray[i][j] == -1)
// System.out.print("O ");
// else
// System.out.print("- ");
// }
// System.out.println();
// }
// System.out.println();
// }

// @Override
// public String toString() {
// StringBuffer sb = new StringBuffer();
// for (int i = 0; i < boardArray.length; i++) {
// for (int j = 0; j < boardArray[0].length; j++) {
// if (boardArray[i][j] == 1)
// sb.append("X ");
// else if (boardArray[i][j] == -1)
// sb.append("O ");
// else
// sb.append("- ");
// }
// sb.append("\n");
// }
// return sb.toString();
// }
// }

// class Game {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// Board game = new Board();
// game.calculateComputerMove();
// System.out.println(game.countO + " -- " + game.countX);
// // game.printTree();

// input.close();
// }
// }