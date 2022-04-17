// link of the problem https://codingbat.com/prob/p110973

public class AnswerCell {
    
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep==true){
          return false;
        }
        if(isMom==true){
          return true;
        }
        if(isMorning==true){
          return false;
        }
        return true;
      }
      
}
