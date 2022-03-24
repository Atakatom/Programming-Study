// link of the problem https://codingbat.com/prob/p197890

public int sumDigits(String str) {
  int result=0;
  str+="X";
  for(int i=0;i<str.length();i++){
    if(Character.isDigit(str.charAt(i))){
      result+=Integer.parseInt(str.substring(i,i+1));
    }
  }
  return result;
}
