public class main {
    public static void main(String[] args) {
        String line = "";
        line += print('A');
        System.out.println(line);
    }

    public static String print(char ch) {
        if (ch < 'Z') {
            return String.valueOf(ch + print(++ch));
        }
        return String.valueOf(ch);
    }
}
