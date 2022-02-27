#include <stdio.h>
#include <stdbool.h>

int main(){
	int n,result;
	result = 0;
	scanf("%d",&n);
	bool loop = true;
	while(loop){
		result = result + (n%10);
		if(n<10)
			loop = false;
		n = n/10;
	}
	printf("%d\n",result);
}
