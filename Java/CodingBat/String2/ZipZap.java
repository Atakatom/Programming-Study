// link of the problem https://codingbat.com/prob/p180759

public String zipZap(String str) {
  String end="";
  if(str.length()>2){
    end=str.substring(0,1);
  for(int i=0;i<str.length()-2;i++){
    if(str.charAt(i)=='z' && str.charAt(i+2)=='p'){
      end+="";
    }
    else{
      end+=str.charAt(i+1);
    }
  }
  end+=str.charAt(str.length()-1);
  return end;
  }
  return str;
}