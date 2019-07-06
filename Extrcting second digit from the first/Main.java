#include <stdio.h>
int main() {
	//Type your code
  int num;
  int num1;
  scanf("%d",&num);
  if(num%10==6){
  	num1=(num/1000)%10;
   printf("%d",num1);
  }
  else{
  	num1= num%10;
    printf("%d",num1);
  
  }
	return 0;
}