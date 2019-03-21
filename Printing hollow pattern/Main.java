#include <stdio.h>
int main() {
	// Type your code here
  int n,row,coll;
    scanf("%d",&n);
  for(row=1;row<=n;row++)
  {
    for(coll=1;coll<=n;coll++)
    {
      if((row==1||coll==1)||(row==n)||(coll==n))
        printf("*");
      else
        printf(" ");
    }
    printf("\n");
  }
    
	return 0;
}