#include <stdio.h>
int main() {
	//Type your code
    int n,sec_dig;
  scanf("%d",&n);
  while(n>=100)
  {
    n=n/10;
  }
  sec_dig=n%10;
  printf("%d",sec_dig);
	return 0;
}