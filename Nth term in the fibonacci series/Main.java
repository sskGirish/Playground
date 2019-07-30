#include<stdio.h>
#include<math.h>
double binet(long n)
{
    double phi = (sqrt(5) + 1) / 2.0;
    return round(pow(phi, n) / sqrt(5));
}
int main(){
    int n;
  scanf("%d",&n);
    printf("%lf",binet(n+1));
  return 0;
}