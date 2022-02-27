#include <stdio.h>

void main(){
	int input;
	printf("Input : ");
	scanf("%d",&input);
	switch (input){
		case 1:
			printf("one");
			break;
		case 2:
			printf("two");
			break;
		case 3:
			printf("three");
			break;
		case 4: 
			printf("four");
			break;
		case 5:
			printf("five");
			break;
		case 6:
			printf("six");
			break;
		case 7: 
			printf("seven");
			break;
		case 8:
			printf("eight");	
			break;
		case 9:
			printf("nine");
			break;
		default:
			printf("greater than 9");
			break;
	}

}
