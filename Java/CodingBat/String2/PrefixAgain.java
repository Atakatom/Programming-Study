// link of the problem https://codingbat.com/prob/p136417

public boolean prefixAgain(String str, int n) {
  int x=0;
  String comp=str.substring(0,n);
  for(int i=0;i+n<=str.length();i++){
    if(comp.equals(str.substring(i,i+n))){
      x++;
      if(x>1){
      return true;
      }
    }
  }
  return false;
}
