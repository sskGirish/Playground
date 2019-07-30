#include <stdio.h>
#include <math.h>
int main() {
	//Type your code here
  	int x,n;
  scanf("%d",&x);	
  if(x%2){
      int half = (x/2);
    	printf("%d",2*half);
  }else{
		int half = (x/2);
    	printf("%d",half-1);
  }
	return 0;
}