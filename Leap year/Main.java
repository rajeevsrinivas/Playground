#include<stdio.h>
int main()
{
  //Type your code here
  int leap;
  scanf("%d",&leap);
  if(leap%400==0){
  	printf("Leap year");
  }
  else if(leap%4==0 && leap%100!=0)
  {
  	printf("Leap year");
  }
  else{
  	printf("Not Leap year");
  } 
  return 0;
}