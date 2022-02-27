// question link https://codingbat.com/prob/p183592

public class Front22 {
    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
    }

    static String front22(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }
        return (str.substring(0, 2) + str + str.substring(0, 2));
    }
}
