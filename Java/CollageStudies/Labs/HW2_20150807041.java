import java.util.Scanner;

public class HW2_20150807041 {
    /*
     * input u static olarak yaratmamin sebebi diger methodlarda da kullanacak olmam
     * ama açıklık olmaması adına input u main methodumun sonunda close ediyorum.
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give the type of input? int=0, string=1, double=2");
        int inputChoice = input.nextInt();
        if (inputChoice == 0) // eger input int olacaksa diger 3 secenegi de ekliyorum
            System.out.println("Give the type of input? or=0, and=1, xor=2, complement=3, right shift=4, left shift=5");
        else
            System.out.println("Give the type of input? or=0, and=1, xor=2");
        int operationChoice = input.nextInt();
        // hangi islem türünü seçeceğini de operationChoice degiskenine alıyorum

        // burada da birazdan input isterken ne yazdiracagimi belirliyorum
        String inputName = "Double Number";
        if (inputChoice == 0)
            inputName = "Integer Number";
        if (inputChoice == 1)
            inputName = "String";

        // result degiskeninde islemimin sonucunu tutulcak
        String result = "";
        /*
         * and, or, ve xor benzer islemler oldugu icin kod tekrarini azaltmak icin ilk 3
         * secenek if diger 3ü ise else içinde çözücem
         */

        if (operationChoice < 3) {
            // eger operasyon and, or, veya xor ise iki input
            String n1 = "";
            String n2 = "";
            System.out.println("First " + inputName + " : ");
            n1 = input.next().trim();
            System.out.println("Second " + inputName + " : ");
            n2 = input.next().trim();
            if (inputChoice == 0) {
                /*
                 * input lar int ise 32 bit olacak demektir ben de ilk olarak n1 ve n2 yi
                 * integera convert edip sonra toBinaryString e çeviriyorum elimdeki binary
                 * string i de kendi methodum olan fillTheLeftoverBits ile 32 bit şekline
                 * getiriyorum
                 */
                n1 = fillTheLeftoverBits(Integer.toBinaryString(Integer.parseInt(n1)), 32);
                n2 = fillTheLeftoverBits(Integer.toBinaryString(Integer.parseInt(n2)), 32);
            } else if (inputChoice == 1) {
                n1 = formatToBinaryBits(n1);
                n2 = formatToBinaryBits(n2);
                /*
                 * şu anda string ler binary bits oldu fakat uzunlukları eşit değil. bu eşit
                 * olmama durumu ileride hem yazdırırken hemde çalışma esnasında mantık hatasına
                 * sebep olacağı için n1 ve n2 yi eşitlemem lazım
                 */
                if (n1.length() > n2.length())
                    while (n1.length() > n2.length())
                        n2 = "0" + n2;
                else
                    while (n2.length() > n1.length())
                        n1 = "0" + n1;

            } else {
                /*
                 * inputlarim double olacagi icin n1 ve n2 yi ilk double a cast ediyorum double
                 * a convert olan n1 ve n2 yi long bits e dönüştürüyorum elimdeki long sayısını
                 * binary string e dönüştürdükten sonra kendi methodum olan fillTheLeftoverBits
                 * ile 64 bit haline getiriyorum
                 */
                n1 = fillTheLeftoverBits(Long.toBinaryString(Double.doubleToLongBits(Double.parseDouble(n1))), 64);
                n2 = fillTheLeftoverBits(Long.toBinaryString(Double.doubleToLongBits(Double.parseDouble(n2))), 64);
            }
            switch (operationChoice) {
            case 0:
                result = or(n1, n2);
                break;
            case 1:
                result = and(n1, n2);
                break;
            case 2:
                result = xor(n1, n2);
                break;
            }
            char[] operators = { '|', '&', '^' };
            /*
             * operators dizisinin amacı sonradan yapacağım çıktı formatı için işlemin and,
             * or, veya xor karakterini kullanicinin seçtiği operationChoice ile aynı
             * indexle elde edebilmek
             */

            System.out.print(prettyFormat(n1));
            System.out.println(" " + operators[operationChoice]);
            System.out.println(prettyFormat(n2));
            for (int i = 0; i < result.length() + 4; i++) {
                System.out.print("-");
            }
            System.out.print("\n" + prettyFormat(result));

            if (inputChoice == 0)
                System.out.print("= " + binaryToDecimal(result));

            if (inputChoice == 1) {
                System.out.print("= ");
                printBinarySequenceAsString(result);
            }
        } else {
            /*
             * operationChoice>=3 yani islemimiz complement, rs veya ls olucak
             */
            System.out.println(inputName + " : ");
            String singleInput = input.next().trim();
            ;
            // originInput sonradan yapacagim yazdirma esnasinda kullanabilmek icin
            // kullanicinin girdigi degeri tutuyor

            int shiftNumber = 0;
            // operationChoice ls veya rs ise shift number input u iste
            if (operationChoice != 3) {
                System.out.println("Shift Number :");
                shiftNumber = input.nextInt();
            }
            switch (operationChoice) {
            case 3:
                result = complement(singleInput);
                break;
            case 4:
                System.out.print(singleInput + " >> " + shiftNumber + " = ");
                result = rs(singleInput, shiftNumber);
                break;
            case 5:
                System.out.print(singleInput + " << " + shiftNumber + " = ");
                result = ls(singleInput, shiftNumber);
                break;
            }
            System.out.println(" = " + result);
        }

        input.close();
    }

    private static String ls(String s, int n) {
        String result = String.valueOf(Integer.parseInt(s) << n);
        String resultInBinaryBits = Integer.toBinaryString(Integer.parseInt(result));
        resultInBinaryBits = fillTheLeftoverBits(resultInBinaryBits, 32);
        System.out.print(prettyFormat(resultInBinaryBits));
        return result;
    }

    private static String rs(String s, int n) {
        String result = String.valueOf(Integer.parseInt(s) >> n);
        String resultInBinaryBits = Integer.toBinaryString(Integer.parseInt(result));
        resultInBinaryBits = fillTheLeftoverBits(resultInBinaryBits, 32);
        System.out.print(prettyFormat(resultInBinaryBits));
        return result;
    }

    private static void printBinarySequenceAsString(String s) {
        /*
         * 1-string s i ilk olarak pretty formata yani 8 bitli gruplara bölüyorum
         * 
         * 2-her 8 karakter arası boşluk olduğu için split methoduyla her elemanı 8 biti
         * temsil eden resultInBytes adlı bir array oluşturuyorum
         * 
         * 3-resultInBytes ın her elemanını parseInt methodunun taban değerini 2 vererek
         * 10 tabanlı sayı elde edip
         * 
         * 4-elde ettiğim 10 tabanlı int değerinin char karşılığını print ediyorum
         */
        String[] resultInBytes = prettyFormat(s).split(" ");
        for (int i = 0; i < s.length() / 8; i++) {
            System.out.print((char) Integer.parseInt(resultInBytes[i], 2));
        }
    }

    private static String prettyFormat(String s) {
        /*
         * 1-result adında boş bir string yaratıp
         * 
         * 2-s değişkeninin her 8 karakterinin arasına bir boşluk gelecek şekilde
         * resulta ekleme yapıyorum
         * 
         * 3-elde ettiğim result değerini döndürüyorum
         */
        String result = "";
        for (int i = 8; i <= s.length(); i += 8) {
            result += (s.substring(i - 8, i) + " ");
        }
        return result;
    }

    private static String complement(String s) {
        String pretty = fillTheLeftoverBits(Integer.toBinaryString(Integer.parseInt(s)), 32);
        System.out.print("~" + prettyFormat(pretty) + " = ");
        int result = Integer.parseInt(s);
        result = ~result;
        String resultInBinaryBits = Integer.toBinaryString(result);
        resultInBinaryBits = fillTheLeftoverBits(resultInBinaryBits, 32);
        System.out.print(prettyFormat(resultInBinaryBits));
        return String.valueOf(result);
        // String result = "";
        // for (int i = 0; i < n1.length(); i++) {
        // if (n1.charAt(i) == '1')
        // result += '0';
        // else
        // result += '1';
        // }
        // return result;
    }

    private static String xor(String n1, String n2) {
        String result = "";
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) != n2.charAt(i))
                result += '1';
            else
                result += '0';
        }
        return result;
    }

    private static String and(String n1, String n2) {
        String result = "";
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) == '1' && n2.charAt(i) == '1')
                result += '1';
            else
                result += '0';
        }
        return result;
    }

    // n1 ve n2 nin aynı charlarını kontrol edip ikisinden bir tanesi 1 ise resulta
    // 1 değilse de 0 ekleyerek devam ediyorum
    private static String or(String n1, String n2) {
        String result = "";
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) == '1' || n2.charAt(i) == '1')
                result += '1';
            else
                result += '0';
        }
        return result;
    }

    static String formatToBinaryBits(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += String.format("%8s", Integer.toBinaryString(s.charAt(i))).replaceAll(" ", "0");
        }
        return result;
    }

    static String fillTheLeftoverBits(String s, int max) {
        while (s.length() < max)
            s = "0" + s;
        return s;
    }

    static int binaryToDecimal(String s) {
        int result = 0;
        int n = 0;
        // i degiskeni > 0 cunku s string inin 0.indexi yani ilk harfi value bit oldugu
        // icin o hesaba katilmiyor
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == '1')
                result += Math.pow(2, n);
            n++;
        }
        // eger sign bit 1 ise degerimiz negatif
        if (s.charAt(0) == 1)
            result *= -1;
        return result;
    }
}
