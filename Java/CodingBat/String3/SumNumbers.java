// link of the problem https://codingbat.com/prob/p121193

public int sumNumbers(String str) {
  int beg=0,fin=0,result=0;
  for(int i=0;i<str.length();i++){
    if(Character.isDigit(str.charAt(i))){
      beg=i;
      for(int j=i;j<str.length();j++){
        if(Character.isDigit(str.charAt(j))){
          fin=j+1;
          i=j;
        }
        else break;
      }
      result+=Integer.parseInt(str.substring(beg,fin));
    }
  }
  return result;
}
