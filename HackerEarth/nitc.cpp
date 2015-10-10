#include<stdio.h>
int main(){
	int n;
	scanf("%d",&n);
	
	int arr[100005][2];
	int ans[100005][2];
	
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i][0]);
		scanf("%d",&arr[i][1]);
	}
	
	for(int i=0;i<n;i++){
	  for(int j=0;j<n;j++){
	  	if(i!=j){
	  		if(arr[i][0]==arr[j][1]){
	  			ans[i][0]++;
	  			ans[j][0]++;
	  		}
	  		else{
	  			ans[i][0]++;
	  			ans[j][1]++;
	  		}
	  	}
	  }	
	}
	for(int i=0;i<n;i++){
       printf("%d %d \n",ans[i][0],ans[i][1]);
}
}
