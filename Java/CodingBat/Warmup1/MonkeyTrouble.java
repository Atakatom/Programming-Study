// question link https://codingbat.com/prob/p181646

public class MonkeyTrouble {
  public static void main(String[] args) {
    System.out.println(monkeyTrouble(true, true));
    System.out.println(monkeyTrouble(true, false));
    System.out.println(monkeyTrouble(false, true));
    System.out.println(monkeyTrouble(false, false));

  }

  static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if (aSmile == bSmile) {
      return true;
    }
    return false;
  }

}
