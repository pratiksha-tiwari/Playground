#include<stdio.h>
int main()
{
  //Type your code here
  int n,fd,td,sum=0;
  scanf("%d",&n);
  fd=n/100;
  td=n%10;
  sum=fd+td;
  printf("%d",sum);
  return 0;
}