#include <stdio.h>
int main() {
    // Type your code here
  int n,i,j;
  scanf("%d",&n);
  int num=n;
  for(i=1;i<=n;i++)
  {
    for(j=num;j>=1;j--)
    {
      printf("%d",j);
    }
    num--;
    printf("\n");
  }
	return 0;
}