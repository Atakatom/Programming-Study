//question link https://codingbat.com/prob/p136351

public class Front3 {
  public static void main(String[] args) {
    System.out.println(front3("Java"));
    System.out.println(front3("Chocolate"));
    System.out.println(front3("abc"));
  }

  static String front3(String str) {
    if (str.length() > 2) {
      String end = str.substring(0, 3);
      return end + end + end;
    }
    return str + str + str;
  }
}
