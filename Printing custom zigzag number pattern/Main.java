#include <stdio.h>
int main() {
	// Type your code here
  int n,row,coll;
  scanf("%d",&n);
  for(row=1;row<=n;row++)
  {
    for(coll=1;coll<=n;coll++)
    {
      if(((row%2==0)&&(coll==1))||((row%2==1)&&(coll==n)))
           printf("%d",row+1);
         else
         printf("%d",row);
    }
    printf("\n");
  }
	return 0;
}