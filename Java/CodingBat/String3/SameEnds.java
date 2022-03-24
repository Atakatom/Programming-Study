// link of the problem https://codingbat.com/prob/p131516

public String sameEnds(String string) {
  int str=string.length()/2+1;
  if(string.length()%2==0){str--;}
  int end=string.length()/2;
  while(!(string.substring(0,end).equals(string.substring(str,string.length())))){
      str++;
      end--;
  }
  return string.substring(0,end);
}
