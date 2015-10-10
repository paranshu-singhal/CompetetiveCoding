#include<stdio.h>
int main(){
	char a[2];
	
	scanf("%s", &a);
	if(a[1]>a[0]){
		printf("t");
	}
	else{
		printf("f");
	}
}
