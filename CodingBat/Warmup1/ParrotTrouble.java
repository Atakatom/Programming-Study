//question link https://codingbat.com/prob/p140449

public class ParrotTrouble {

  public static void main(String[] args) {
    System.out.println(parrotTrouble(true, 6));
    System.out.println(parrotTrouble(true, 7));
    System.out.println(parrotTrouble(false, 6));
  }

  static boolean parrotTrouble(boolean talking, int hour) {
    if (talking && (hour < 7 || hour > 20)) {
      return true;
    }
    return false;
  }

}
