#include<stdio.h>
int main()
{
  //Type your code here
  int n,fd,ld,sum=0;
  scanf("%d",&n);
  fd=n/10;
  ld=n%10;
  sum=fd+ld;
  printf("%d",sum);
  return 0;
}