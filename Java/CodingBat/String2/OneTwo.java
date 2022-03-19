// link of the problem https://codingbat.com/prob/p122943

public String oneTwo(String str) {
  String end="";
  for(int i=0;i<str.length()-2;i+=3){
    end += str.substring(i+1,i+3)+str.charAt(i);
  }
  return end;
}
