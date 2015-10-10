#include<iostream>
#include<cstring>
#include<cstdlib>
using namespace std;
int main(){
	int t;
	std::cin>>t;
	while(t--){
		int n,p,k;
		scanf("%d", &n);
		scanf("%d", &p);
		scanf("%d", &k);
		
		int arr[n+2];
		bool arr2[n+5];
		
		memset(arr2, 0, sizeof(arr2));
		
			
		int i=1;
		int cnt=0;
		
		while(1){
		  if(arr2[i]==0){
		  
		  arr2[i]=1;
		  cnt++;
		  if(cnt==k){
		  	printf("%d \n",i);
		  	break;
		  }
		  i+=p;
		  if(i>n-1){
		  	i-=n;
		  }
		}
		else{
			printf("-1 \n");
		}
	    
	}
}
}
