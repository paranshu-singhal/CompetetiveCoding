#include<stdio.h>
int main(){
	int n,k;
	scanf("%d",&n);
	scanf("%d",&k);
	
	int arr[100000];
	
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	
	int cnt=0;
	
	for(int i=0;i<n-1;i++){
	  for(int j=i+1;j<n;j++){
	    if(arr[i]%arr[j]!=k){
		cnt++;
	   }
	   else{
	   	break;
	   }
    }
}
printf("%d %d",cnt,cnt+n);
}
