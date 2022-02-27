// question link https://codingbat.com/prob/p191914

public class NotString {
  public static void main(String[] args) {
    System.out.println(notString("candy"));
    System.out.println(notString("X"));
    System.out.println(notString("not bad"));
  }

  static String notString(String str) {
    if (str.length() > 2 && str.substring(0, 3).equals("not")) {
      return str;
    }
    return "not " + str;
  }
}
