// link of the problem https://codingbat.com/prob/p137136

public class FizzString {
    
    public String fizzString(String str) {
        if(str.startsWith("f") && str.charAt(str.length()-1)=='b'){
          return "FizzBuzz";
        }
        if(str.charAt(0)=='f'){
          return "Fizz";
        }
        if(str.charAt(str.length()-1)=='b'){
          return "Buzz";
        }
        return str;
      }
      
}
