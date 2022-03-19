// link of the problem https://codingbat.com/prob/p159772

public boolean xyzMiddle(String str) {
  if(str.length()<3){return false;}
  for(int i=0;i<str.length()-2;i++){
    if(str.substring(i,i+3).equals("xyz")){
      int a=str.substring(0,i).length();
      int b=str.substring(i+3).length();
      if(Math.abs(a-b)<=1){
        return true;
      }
    }
  }
  return false;
}
