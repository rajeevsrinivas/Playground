#include <stdio.h>
int main() {
	//Type your code
  int n,i,temp=0;
  scanf("%d",&n);
  
  for(i=0;temp<n;i++){
  	if(i%2!=0){
    	printf("%d\n",i);
      temp = temp + 1;
    }
    }
    
  
	return 0;
}