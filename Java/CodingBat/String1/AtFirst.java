// question link https://codingbat.com/prob/p139076

public class AtFirst {
    public static void main(String[] args) {
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
    }

    static String atFirst(String str) {
        if(str.length()<1){
          return "@@";
        }
        else if(str.length()==1){
          return str+"@";
        }
        else
          return str.substring(0,2);
      }
}
