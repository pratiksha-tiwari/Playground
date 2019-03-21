#include <stdio.h>
int main() {
	// Type your code here
  int n,row,coll;
  scanf("%d",&n);
  for(row=1;row<=n;row++)
  {
    for(coll=1;coll<=n;coll++)
    {
      if((row==coll)||(row+coll==n+1))
      {
        printf("*");
      }
      else
        printf(" ");
    }
    printf("\n");
  }
  
	return 0;
}