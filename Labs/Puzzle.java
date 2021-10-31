import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Puzzle {
    static Map<Character, Map<Integer, ArrayList<Integer>>> holder = new HashMap<Character, Map<Integer, ArrayList<Integer>>>();

    /* holder is keeping which char is in which sentence and which index */
    public static void main(String[] args) {

        char[] arr1 = args[0].trim().toCharArray();
        fillHolder(1, arr1);
        char[] arr2 = args[1].trim().toCharArray();
        fillHolder(2, arr2);
        char[] arr3 = args[2].trim().toCharArray();
        fillHolder(3, arr3);

        System.out.println(holder.toString());
    }

    public static void fillHolder(int sentenceIndex, char[] sentence) {
        for (int i = 0; i < sentence.length; i++) {
            ArrayList<Integer> tempArr;
            Map<Integer, ArrayList<Integer>> tempMap;
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

    public void recursiveArrangement() {

    }

    public void checkValid() {

    }

}
