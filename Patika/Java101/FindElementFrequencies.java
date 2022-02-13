package Java101;

import java.util.ArrayList;
import java.util.Arrays;

//hw for https://app.patika.dev/moduller/java101/odev-array-count

public class FindElementFrequencies {

    public static void main(String[] args) {

	    int[] list={3,3,13,12,5,6,3,5,9,14,6,14,0,14};

        var repetitive = new ArrayList<String>();
        System.out.println(Arrays.toString(list));

        for (int i = 0; i <list.length ; i++) {
            
            int frequency = 0;

            for (int j = 0; j <list.length ; j++) {
                if(list[i] == list[j]){
                    frequency++;
                }
            }
            String s = "Number "+ list[i]+" has repeated " +frequency+" times";
            if(frequency>1 && !repetitive.contains(s)){
                repetitive.add(s);
            }
        }
        for(String e : repetitive){
            System.out.println(e);
        }
    }
}
