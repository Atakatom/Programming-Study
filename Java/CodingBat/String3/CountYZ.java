// link of the problem https://codingbat.com/prob/p199171

public int countYZ(String str) {
  int count=0;
  for(int i=1;i<str.length();i++){
    if (!(Character.isLetter(str.charAt(i)))){
      if(Character.toLowerCase(str.charAt(i-1))=='y' || Character.toLowerCase(str.charAt(i-1))=='z'){count++;}
    }
    if(i==str.length()-1){
      if(Character.toLowerCase(str.charAt(i))=='y' || Character.toLowerCase(str.charAt(i))=='z'){count++;}
    }
  }
  return count;
}
