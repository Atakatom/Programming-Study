// link of the problem https://codingbat.com/prob/p170829

public String plusOut(String str, String word) {
  int start = 0;
    int end = str.indexOf(word);
    while (end != -1) {
        for (int i = start; i < end; i++)
            str = str.substring(0,i) + "+" + str.substring(i+1);
        start = end + word.length();
        end = str.indexOf(word, start);
    }
    for (int i = start; i < str.length(); i++)
        str = str.substring(0,i) + "+" + str.substring(i+1);
    return str;
}
