// link of the problem https://codingbat.com/prob/p192570

public String withoutString(String base, String remove) {
  String result="";
  int index=base.toLowerCase().indexOf(remove.toLowerCase());
  while(index!=-1){
    result += base.substring(0,index);
    base=base.substring(index+remove.length());
    index=base.toLowerCase().indexOf(remove.toLowerCase());
  }
  result+=base;
  return result;
}
