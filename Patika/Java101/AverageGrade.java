package Java101;

import java.util.Scanner;

public class AverageGrade{
	public static void main(String[] args){
		String[] courseNames = {"Mathematics","Physics","English","History","Chemistry","Music"};
		int avgGrade = 0;

		var scan = new Scanner(System.in);

		for(int i = 0; i < courseNames.length; i++){
			System.out.printf("%s grade: ",courseNames[i]);
			avgGrade += scan.nextInt();
		}

		avgGrade = avgGrade / courseNames.length;

		scan.close();
		
		System.out.println(avgGrade > 60 ? "Student has passed the class" : "Student has failed");
	}
}
