#include <stdio.h>

int main(){
	int a,b;
	float x,y;
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%f",&x);
	scanf("%f",&y);
	printf("%d %d\n%1.1f %1.1f\n",(a+b),(a-b),(x+y),(x-y));
	return 0;
}
