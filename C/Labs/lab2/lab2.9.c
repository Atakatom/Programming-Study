#include <stdio.h>

void myfunc1(int n);
void myfunc2(int *n);

/*program will show the difference of using a variable and using its address*/

void main(){
	int a;
	a = 1;
	printf("Before pass-by-value : %d\n",a);
	myfunc1(a);
	printf("After pass-by-value : %d\n\n",a);
	printf("Before passing address : %d\n",a);
	myfunc2(&a);
	printf("After passing address : %d\n",a);
}

void myfunc1(int n){
	n = n + 1;
	printf("Inside pass-by-value : %d\n",n);
}

void myfunc2(int *n){
	*n = *n + 1;
	printf("Inside passing address : %d\n",*n);
}
