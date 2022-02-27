#include <stdio.h>

int main(){
	char c;
	char s[99];
	char sen[99];
	scanf("%c",&c);
	scanf("%s",s);
	scanf(" %[^\n]s\n",sen);
	printf("%c\n%s\n%s\n",c,s,sen);
	return 0;
}
