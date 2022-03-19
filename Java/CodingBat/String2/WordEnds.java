// link of the problem https://codingbat.com/prob/p147538

public String wordEnds(String str, String word) {
  String res = "";
    int pos = str.indexOf(word);
    while (pos != -1) {
        if (pos != 0) res += str.charAt(pos-1);
        if (pos + word.length() == str.length()) break; 
        res += str.charAt(pos + word.length());
        pos = str.indexOf(word, pos+1);
    }
    return res;
}
