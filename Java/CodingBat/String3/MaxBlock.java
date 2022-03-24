// link of the problem https://codingbat.com/prob/p179479

public int maxBlock(String str) {
  int max=0;
  for(int i=0;i<str.length()-1;i++){
    int count=0;
      for(int j=i;j<str.length();j++){
      if(str.charAt(i)==str.charAt(j)){count++;}
      else{break;}
      }
      if(count>max){max=count;}
  }
  return max;
}
