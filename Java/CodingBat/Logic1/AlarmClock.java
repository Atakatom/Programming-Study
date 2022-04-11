// link of the problem https://codingbat.com/prob/p160543

public class AlarmClock {
    
    public String alarmClock(int day, boolean vacation) {
        if(vacation==true){
          if(day>0 && day<6){
            return "10:00";
          }
          return "off";
        }
        if(day>0 && day<6){
            return "7:00";
          }
          return "10:00";
        
      }
      
}
