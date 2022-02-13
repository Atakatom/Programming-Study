package Java101;

// hw for https://app.patika.dev/moduller/java101/pratik-array-ortalama

public class HarmonicArraySum {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += harmonicValue(numbers[i]);
        }

        System.out.println(sum / numbers.length);
    }

    public static double harmonicValue(int num){
        double result = 0;
        for(int i = 1; i < num; i++){
            result += 1/i;
        }
        return result;
    }

}
