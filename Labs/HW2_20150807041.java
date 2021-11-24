import java.util.Scanner;

public class HW2_20150807041 {
    //input u static olarak yaratmamin sebebi diger methodlarda da kullanacak olmam
    //ama açıklık olmaması adına input u main methodumun sonunda close ediyorum.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //listOfChoice benim kullanıcıya sunucağım input seçenekleri içeriyor
        String listOfChoice = "int=0, strint=1, double=2";
        //aynı satırları tekrar etmemek adına inputları alma işlemini takeInput methodunda gerçekleştiriyorum
        int inputChoice = takeInput(listOfChoice);
        //input degeri ne olursa olsun ilk üç işlem seçeneği hepsinde var
        listOfChoice="or=0, and=1, xor=2";
        if(inputChoice==0)//eger input int olacaksa diger 3 secenegi de ekliyorum
            listOfChoice+=", complement=3, right shift=4, left shift=5";
        //hangi islem türünü seçeceğini de operationChoice degiskenine alıyorum
        int operationChoice = takeInput(listOfChoice);
        System.out.println(Long.toBinaryString(Double.doubleToLongBits(5.0)));
        System.out.println(convertToBinary(5));
        System.out.println(Integer.toBinaryString(5));
        input.close();

    }
    static int takeInput(String list){
        int maxChoice=1;
        int fromIndex=0;
        while(list.indexOf(" ",fromIndex)!=-1){
            fromIndex=list.indexOf(" ",fromIndex);

        }
        int i = -1;
        while(i < 0 || i >2) {
            System.out.println("Give the type of input? "+list);
            i = input.nextInt();
            if(i < 0 || i > 2)
                System.out.println("ERROR!: Invalid choice, please enter again...\n");
        }
        return i;
    }
    static String convertToBinary(int n){
        /*
        we should get the max pow of two which is smaller than n
        and subtract it from n every time until n = 0, as an example,
        let's say n is 55 so we need 32 and subtract it from 55,
        remains 55-32=23 and now we need 16 and remains is 23-16=7,
        we can't have 8 since it is bigger than 7 so the spot for 8 is 0,
        we have 4 and remains 7-4=3, and goes on as 3-2=1, 1-1=0 so
        up until now we had 32, 16, 4, 2, 1 which will transfer to 110111 in binary.

        My algorithm will function as I mentioned above
        */
        String result="";
        int pow=0;
        while (Math.pow(2, pow) < n)
            pow++;
        pow--;
        while(n>0) {
            if(n>=Math.pow(2,pow)){
                n-=Math.pow(2,pow);
                result+="1";
            } else {
                result+="0";
            }
            pow--;
        }
        while(pow-->=0)
            result+="0";
        return result;
    }
}

