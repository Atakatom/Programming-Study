// link of the problem https://codingbat.com/prob/p141736

public boolean equalIsNot(String str) {
  int count1=0;
  int count2=0;
  for (int i=0;i<str.length()-2;i++){
      if(str.substring(i,i+2).equals("is")){count1++;}
      if(str.substring(i+1,i+3).equals("is")){count1++; i++;}
      if(str.charAt(i)=='n'){if(str.substring(i,i+3).equals("not")){count2++;}}
  }
  return(count1==count2);
}
