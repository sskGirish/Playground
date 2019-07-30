// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n;
  int count=0;
  scanf("%d", &n);
  if(n==1||n==0){
    printf("neither");
  	return 0;
  }
  for (int i=2;i<=n/2;i++)
  {
    if(n%i==0)
      count++;
  
  }
  if(count>=1)
    printf("composite");
  else printf("prime");
  
   return 0;
}