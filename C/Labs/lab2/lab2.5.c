#include <stdio.h>

#define IN 1	/* inside a word */
#define OUT 0	/* outside a word*/

/* count lines, words, and characters in input */

void main(){
	int c,nl,nw,nc,state;
	state = OUT;
	nl = nw = nc = 0;
	while((c=getchar()) != EOF){
		++nc;
		if(c=='\n')
			nl++;
		if(c=='\n' || c==' ' || c=='\t')
			state = OUT;		
		if(state == OUT){
			state = IN;
			nw++;
		}
	}
	printf("%3d%3d%3d\n", nl, nw, nc);
}
