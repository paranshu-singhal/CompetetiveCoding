#include<stdio.h>
#include<iostream>
#include<algorithm>
#include<string.h>
using namespace std;
int main(){
	int t;
	scanf("%d", &t);
	while(t--){
	
	char arr[105];
//	char arr1[105];
	scanf("%s", &arr);
	bool f=1;
	int len=strlen(arr);
    for(int i=0;i<len-1;i++){
    	if(arr[i]<arr[i+1]){
    		f=0;
    		break;
    	}
    }
    if(f==0){
   // 	strcpy(arr1, arr);
        std::next_permutation(arr, arr+len);
        printf("%s \n", arr); 
    }
    else{
    	 printf("no answer \n");
    }
}
}
