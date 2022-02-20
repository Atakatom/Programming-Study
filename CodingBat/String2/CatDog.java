// question link https://codingbat.com/prob/p111624

public class CatDog {
    public boolean catDog(String str) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                count1++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                count2++;
            }
        }
        return (count1 == count2);
    }
}
