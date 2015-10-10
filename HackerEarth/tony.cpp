#include<stdio.h>
using namespace std;
int main(){
	int t;
	scanf("%d",&t);
	
	int arr[t+1];
	
	for(int i=0;i<t;i++){
		scanf("%d",&arr[i]);
	} 
	int m;
	scanf("%d",&m);
	for(int i=0;i<m;i++){
	
	  int p;
	  scanf("%d",&p);
	  for(int j=0;j<t;j++){
	  	if(arr[j]>p){
	  		arr[j]--;
	  	}
	  }
	}
	for(int j=0;j<t;j++){
      printf("%d",arr[j]);		
   }
}
