// link of the problem https://codingbat.com/prob/p115243

public class FizzString2 {
    
    public String fizzString2(int n) {
        if(n % 3==0 && n%5==0){return "FizzBuzz!";}
        if(n % 3==0){ return "Fizz!";}
        if(n%5==0){return "Buzz!";}
        return String.valueOf(n)+"!";
      }
      
}
