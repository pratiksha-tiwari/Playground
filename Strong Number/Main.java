#include <stdio.h>
int main() {
	//Type your code
  int n,temp,sum=0,rem,i,fact=1;
  scanf("%d",&n);
  temp=n;
  while(temp>0)
  {
    rem=temp%10;
    fact=1;
    for(i=1;i<=rem;i++)
      fact=fact*i;
    sum=sum+fact;
    temp=temp/10;
  }
  if(n==sum)
    printf("Yes");
  else
    printf("No");
	return 0;
}