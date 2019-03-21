#include<stdio.h>
int sum_natural(int num)
{
  int i, sum=0;
for(i=1;i<=num;i++)
  sum=sum+i;
return sum;
}
int main() {
    // Type your code here
  int num;
  scanf("%d",&num);
  printf("%d",sum_natural(num));
  	return 0;
}