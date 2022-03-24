// link of the problem https://codingbat.com/prob/p154137

public String notReplace(String str) {
  String result="";
  str=" "+str+" ";
  for(int i=1;i<str.length()-1;i++){
    if(str.charAt(i)=='i'){
      if(str.charAt(i+1)=='s' && !Character.isLetter(str.charAt(i-1)) && !Character.isLetter(str.charAt(i+2))){
        result+="is not";
        i++;
      }
      else result+="i";
    }
    else result+=str.charAt(i);
  }
  return result;
}