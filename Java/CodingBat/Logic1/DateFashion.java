// link of the problem https://codingbat.com/prob/p103360

public class DateFashion {
    
    public int dateFashion(int you, int date) {
        if(you<3 || date<3){return 0;}
        if(you>=8 || date>=8){return 2;}
         
        return 1;
        
      }
      
}
