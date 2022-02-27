package Java101;

//hw for https://app.patika.dev/moduller/java101/odev-asal-sayi

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime;
        System.out.print(2+" ");
        for (int i = 3; i < 100; i++) {
            isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
