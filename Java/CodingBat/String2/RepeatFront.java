// link of the problem https://codingbat.com/prob/p128796

public String repeatFront(String str, int n) {
  String end="";
  for(int i=n;i>0;i--){
    end+=str.substring(0,i);
  }
  return end;
}
