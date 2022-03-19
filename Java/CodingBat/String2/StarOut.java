// link of the problem https://codingbat.com/prob/p139564

public String starOut(String str) {
  while (str.indexOf('*') != -1) {
        if (str.equals("*")) return "";
        int starPos = str.indexOf('*');
        int secondStar = str.indexOf('*', starPos+1);
        if (secondStar - starPos == 1) {
            str = str.substring(0,starPos) + str.substring(secondStar);
            continue;
        }
        if (starPos == 0) str = str.substring(starPos+2);
        else if (starPos == str.length()-1)
            str = str.substring(0, str.length()-2);
        else str = str.substring(0, starPos-1) + str.substring(starPos+2);
    }
    return str;
}
