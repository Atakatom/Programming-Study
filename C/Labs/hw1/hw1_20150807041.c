#include <stdio.h>

/*Taking min and max value as input 
	then increasing 10 by 10 from min to max
		by converting the value fahrenheit to celsius
*/
void fahrenheitToCelsius(int f);

int main(){
	int x,y;
	scanf("%d",&x);
	printf("min value is : %d\n",x);
	scanf("%d",&y);
	printf("max value is : %d\n",y);
	
	while(x <= y){
		fahrenheitToCelsius(x);
		x = x + 10;
	}
	return 0;
}

void fahrenheitToCelsius(int f){ 
	float c = (f-32)/1.8; 
	printf("Fahrenheit : %4dF --> Celsius : %3.2fC\n",f,c);
}
