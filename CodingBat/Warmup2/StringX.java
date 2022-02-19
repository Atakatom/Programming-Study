// question link https://codingbat.com/prob/p171260

public class StringX {

  public static void main(String[] args) {
    System.out.println(stringX("xxHxix"));
    System.out.println(stringX("abxxxcd"));
    System.out.println(stringX("xabxxxcdx"));
  }

  static String stringX(String str) {
    String end = "";
    for (int i = 0; i < str.length(); i++) {
      if (i == 0 || i == str.length() - 1) {
        end = end + str.charAt(i);
      }
      if (i > 0 && i < str.length() - 1 && str.charAt(i) != 'x') {
        end = end + str.charAt(i);
      }
    }
    return end;
  }
}
