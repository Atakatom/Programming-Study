// link of the problem https://codingbat.com/prob/p198664

public boolean gHappy(String str) {
  str="X"+str+"X";
  for(int i=1;i<str.length()-1;i++){
    if(str.charAt(i)=='g'){
      if(str.charAt(i+1)=='g' || str.charAt(i-1)=='g'){
        continue;
      }
      else{return false;}
    }
  }
  return true;
}