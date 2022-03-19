// link of the problem https://codingbat.com/prob/p109637

public String repeatSeparator(String word, String sep, int count) {
  String end="";
  for(int i=0;i<count;i++){
    end+=word;
    if(i<count-1){
      end+=sep;
    }
  }
  return end;
}
