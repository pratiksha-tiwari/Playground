#include<stdio.h>
  int square(int n)
{
 // while(n!=0)
 // {
   int sq=n*n;
//  }
  return sq;
}

int main()
{
   // Type your code here
  int n;
  scanf("%d",&n);
  int sqr=square(n);
    n=sqr;
  printf("%d",n);
   return 0;
}