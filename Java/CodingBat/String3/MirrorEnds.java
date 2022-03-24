// link of the problem https://codingbat.com/prob/p139411

public String mirrorEnds(String string) {
  int str=0;
  int end=string.length()-1;
  for(int i=0;i<string.length();i++){
    if(string.charAt(str)==string.charAt(end)){
      str++;
      end--;
    }
  }
  return string.substring(0,str);
}
