#include <stdio.h>

/* count digits, white space, other characters */

void main(){
	int c, i, nwhite, nother;
	int ndigit[10];
	nwhite = nother = 0;
	for(i = 0; i < 10; i++){
		ndigit[i] = 0;
	}
	
	while((c = getchar()) != EOF)
		if(c>='0' && c<='9')
			++ndigit[c-'0'];
		else if (c==' ' || c=='\n' || c=='\t')
			++nwhite;
		else
			++nother;
	
	printf("\ndigits =");
	for(i = 0;i < 10; i++)
		printf("%1d-->%-4d",i, ndigit[i]);
	printf("\nwhite space = %d, other = %d\n",nwhite,nother);
}
