#include <stdio.h>
int main() {
	int num;
  scanf("%d",&num);
  int count=1;
  int num1;
  int sum=0;
  while(num>0){
    	num1=num %10;
    	num=num/10;
    sum=sum+num1;
  }
  printf("%d",sum);
	return 0;
}