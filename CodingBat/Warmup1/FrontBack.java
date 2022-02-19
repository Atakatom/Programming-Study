// question link https://codingbat.com/prob/p123384

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
        
    }

    static String frontBack(String str) {
        if(str.length()>1)
          return str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0);
        return str;
      }
}
