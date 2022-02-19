// question link https://codingbat.com/prob/p100905

public class DelDel {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }

    static String delDel(String str) {
        if(str.length()>3){
          if(str.substring(1,4).equals("del")){
            return str.charAt(0)+str.substring(4);
          }
          return str;
        }
        return str;
      }
}
