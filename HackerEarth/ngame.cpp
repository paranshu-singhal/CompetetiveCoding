#include<bits/stdc++.h>
int main(){
	int test;
	scanf("%d", &test);
	int n;
	while(test--){
		scanf("%d", &n);
		if(n%4){
			printf("First");
		}
		else{
			printf("Second");
		}
	}
}
