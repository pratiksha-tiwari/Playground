#include <stdio.h>
int main() {
	//Type your code
  int n,fd,ld,temp,sum=0;
  scanf("%d",&n);
  //temp=n;
  ld=n%10;
  while(n>=10)
  {
    n=n/10;
  }
  fd=n;
  sum=fd+ld;
  printf("%d",sum);
	return 0;
}