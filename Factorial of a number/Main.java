#include <stdio.h>
int main() {
	//Type your code
  int n,fact=1,i;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
    fact=i*fact;
  printf("%d",fact);
	return 0;
}