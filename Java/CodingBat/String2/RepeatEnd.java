// link of the problem https://codingbat.com/prob/p152339

public String repeatEnd(String str, int n) {
  String end=str.substring(str.length()-n);
  String eend="";
  for(int i=0;i<n;i++){
    eend+=end;
  }
  return eend;
}
