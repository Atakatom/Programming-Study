/*
* @author   Atakan Yontar
* @schoolNo 20150807041
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Puzzle {
    private static Map<Character, HashMap<Integer, ArrayList<Integer>>> holder = new HashMap<Character, HashMap<Integer, ArrayList<Integer>>>();
    private static Set<String> everyPossibleOutcome = new HashSet<>();
    private static String[] inputs = new String[3];

    /*
     * holder in amaci hangi karakterin hangi kelimede kacinci indexte oldugunu
     * tutmak ama bu index sirasini reverse olarak tutuyor bu da ileride hangi
     * hanede olduklarini hesaplamadan islem yapabilmemi sagliyor
     */
    public static void main(String[] args) {
        boolean correctInput = true;
        while (correctInput) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%-25s", "Enter 1st input value: ");
            inputs[0] = input.nextLine().trim().toLowerCase();
            if (!validInput(inputs[0]))
                continue;
            System.out.printf("%-25s", "Enter 2nd input value: ");
            inputs[1] = input.nextLine().trim().toLowerCase();
            if (!validInput(inputs[1]))
                continue;
            System.out.printf("%-25s", "Enter Output value: ");
            inputs[2] = input.nextLine().trim().toLowerCase();
            if (!validInput(inputs[2]))
                continue;
            /*
             * aldigim inputlari reverse hale getirip static map ime yukluyorum sonra isime
             * yarayacak
             */
            StringBuilder str = new StringBuilder(); // kolayca reverse yapabilmek icin string builder kullaniyorum
            for (int i = 0; i < 3; i++) {
                str.append(inputs[i]);
                str.reverse();
                fillHolder(i, str.toString().toCharArray());// 3 kelimeyi de ayri ayri holder a yukluyorum
                str.setLength(0); // string builder i her seferinde sifirliyorum ki kelimeler karismasin
            }
            if (holder.keySet().size() > 10) {
                System.out.println("ERROR : It is impossible to have more than 10 unique digits");
                continue;
            } else {
                int[] solution = new int[10];
                int[] u = new int[10];
                for (int i = 0; i <= 9; i++) {
                    u[i] = i;
                    solution[i] = -1;
                }
                System.out.print("searching...");
                puzzleSolve(holder.size(), solution, u);
                if (everyPossibleOutcome.size() > 0) {
                    System.out.println("found!");
                    Iterator<String> it = everyPossibleOutcome.iterator();
                    if (everyPossibleOutcome.size() == 1) {
                        System.out.println("There is only one possible outcome.");
                        System.out.println(it.next());
                    } else {
                        System.out.println("You have total of " + everyPossibleOutcome.size() + " possible outcome");
                        System.out.println("And here is one of it,\n" + it.next());
                        System.out.print("Would you like to see all of the outcomes?(Y/N): ");
                        boolean choice = false;
                        try {
                            if (input.hasNext() && input.nextLine().trim().toLowerCase().charAt(0) == 'y')
                                choice = true;
                        } catch (Exception e) {// if input is wrong do nothing because it means NO
                        } finally {
                            int equation = 1;
                            if (choice) {
                                for (String s : everyPossibleOutcome)
                                    System.out.println("Equation number " + equation++ + "\n" + s + "\n");
                            }
                        }
                    }
                } else {
                    System.out.println("\nSorry but there is no possible outcome.");
                }
                correctInput = false;
            }
            input.close();
        }
    }

    static boolean validInput(String s) {
        if (s.length() < 2 || s.length() > 6) {
            System.out.println("inputs must be in the range of 2 to 6 included...\nPlease enter the inputs again...");
            return false;
        }
        return true;

    }

    // collection ile bu method calismiyor map, set, list hepsini denedim ama nafile
    static void puzzleSolve(int k, int[] s, int[] u) {
        for (int i = 0; i < u.length; i++) {// ben de array ile seti taklit ettim
            if (u[i] >= 0) {
                int endOfS = 0;// endOfS ile s'nin son bos olan( yani -1 )indexini ariyorum
                while (s[endOfS] > -1) {
                    endOfS++;
                }
                s[endOfS] = u[i];// s nin bitisine u dan aldigim degeri atiyorum
                u[i] = -1;// -1 bosu temsil ediyor
                if (k == 1) {
                    checkValid(s);
                } else {
                    puzzleSolve(k - 1, s, u);
                }
                u[i] = s[endOfS];
                s[endOfS] = -1;// yeniden sona -1 koyuyorum
            }
        }
    }

    static void checkValid(int[] arr) {
        int[] equation = new int[3];
        int i = 0;
        for (Map.Entry<Character, HashMap<Integer, ArrayList<Integer>>> entry : holder.entrySet()) {
            // entry de bulunan map hangi kelimede hangi indexlere ayni degerler atanacagi
            for (Map.Entry<Integer, ArrayList<Integer>> innerEntry : entry.getValue().entrySet()) {
                // innerEntry ise hangi indexlerdeki degerlerin ayni olacagini belirliyor
                for (Integer k : innerEntry.getValue()) {
                    // indexlere birer birer eriserek looptan edindigimiz katsayilari
                    // yerlestiriyoruz
                    // onceden holder a index eklerken reverse etme amacim ise burada ortaya cikiyor
                    // eger elimde abc kelimesi varsa a nin indexi 0 iken hane degeri 100 ve c nin
                    // indexi 2 iken hane degeri 1
                    // bende onceden reverse ederek hangi hanede olduklarini bulmakla ugrasmiyorum
                    if (arr[i] >= 0)
                        equation[innerEntry.getKey()] += (int) Math.pow(10, k) * arr[i];
                }
            }
            i++;
        }
        if (equation[0] + equation[1] == equation[2]) {
            everyPossibleOutcome.add(inputs[0] + " : " + equation[0] + "\n" + inputs[1] + " : " + equation[1] + "\n"
                    + inputs[2] + " : " + equation[2]);
        }
    }

    static void fillHolder(int sentenceIndex, char[] sentence) {
        for (int i = 0; i < sentence.length; i++) {
            ArrayList<Integer> tempArr;
            HashMap<Integer, ArrayList<Integer>> tempMap;
            if (holder.containsKey(sentence[i])) {
                tempMap = holder.get(sentence[i]);
                if (tempMap.containsKey(sentenceIndex)) {
                    tempArr = tempMap.get(sentenceIndex);
                    tempArr.add((Integer) i);
                } else {
                    tempArr = new ArrayList<>();
                    tempArr.add((Integer) i);
                }
                tempMap.put(sentenceIndex, tempArr);
            } else {
                tempArr = new ArrayList<>();
                tempArr.add((Integer) i);
                tempMap = new HashMap<Integer, ArrayList<Integer>>();
                tempMap.put(sentenceIndex, tempArr);
                holder.put(sentence[i], tempMap);
            }
        }
    }
}
