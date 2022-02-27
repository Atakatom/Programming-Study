//question link https://codingbat.com/prob/p116624

public class Diff21 {
  public static void main(String[] args) {
    System.out.println(diff21(19));
    System.out.println(diff21(35));
    System.out.println(diff21(22));
    System.out.println(diff21(18));
  }

  static int diff21(int n) {
    if (n >= 21) {
      return 2 * (n - 21);
    }
    return 21 - n;
  }
}
