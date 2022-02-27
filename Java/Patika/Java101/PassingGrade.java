package Java101;

import java.util.Scanner;

public class PassingGrade{
	public static void main(String[] args){
		String[] courseNames = {"Mathematics","Physics","English","Chemistry","Music"};
		int avgGrade = 0;
        int tempGrade = 0;
        int contributedLessonNumber = 0;
		var scan = new Scanner(System.in);

		for(int i = 0; i < courseNames.length; i++){
			System.out.printf("%s grade: ",courseNames[i]);
            tempGrade = scan.nextInt();
            if(tempGrade >= 0 && tempGrade<=100){
                avgGrade += tempGrade;
                contributedLessonNumber++;
            } else {
                System.out.println("The grade you entered will not be contributed to calculation since it is invalid!");
            }
		}

		avgGrade = avgGrade / contributedLessonNumber;

		scan.close();
		
		System.out.println(avgGrade >= 55 ? "Student has passed the class" : "Student has failed");
	}
}
