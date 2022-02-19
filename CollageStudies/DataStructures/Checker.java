// package DataStructures;

// import java.util.*;

// class Checker implements Comparator{
// @Override
// public static void compare(T o1, T o2){

// }
// }

// class Player{
// String name;
// int score;

// Player(String name, int score){
// this.name = name;
// this.score = score;
// }
// }

// class Solution {

// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// int n = scan.nextInt();

// Player[] player = new Player[n];
// Checker checker = new Checker();

// for(int i = 0; i < n; i++){
// player[i] = new Player(scan.next(), scan.nextInt());
// }
// scan.close();

// Arrays.sort(player, checker);
// for(int i = 0; i < player.length; i++){
// System.out.printf("%s %s\n", player[i].name, player[i].score);
// }
// }
// }