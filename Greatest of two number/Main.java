#include<stdio.h>
int main()
{
  int num1,num2;
  scanf("%d",&num1);
  scanf("%d",&num2);
  if(num2>num1){
  	printf("num2 is the greatest");
  }
 else if(num1>num2){
    printf("num1 is the greatest");
  }
  else{
    printf("Both number Equal");
  }
  return 0;
}