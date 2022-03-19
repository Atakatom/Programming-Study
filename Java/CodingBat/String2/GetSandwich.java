// link of the problem https://codingbat.com/prob/p129952

public String getSandwich(String str) {
  int count=0;
  if(str.length()<10){return "";}
  for(int i=0;i<str.length()-4;i++){
    if(str.substring(i,i+5).equals("bread")){
      if(i+5<str.length()-5){
      for(int j=str.length();j>i+5;j--){
       if(str.substring(j-5,j).equals("bread")){
         return str.substring(i+5,j-5);
       } 
      }
      }
    }
  }
    return "";
}
