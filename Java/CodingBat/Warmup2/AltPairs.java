// question link https://codingbat.com/prob/p121596

public class AltPairs {

    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    static String altPairs(String str) {
        String end = "";
        for (int i = 0; i < str.length(); i += 4) {
            if (i + 1 < str.length()) {
                end = end + str.substring(i, i + 2);
            } else {
                end = end + str.charAt(i);
            }
        }
        return end;
    }
}
