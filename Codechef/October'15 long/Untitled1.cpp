#include<bits/stdc++.h>
#define len 100005
typedef long long ull;
int main(){
	int t;
	std::cin>>t;
	
	ull arr[len];
	ull ans[len];
	
	while(t--){
		std::fill_n(arr,len,0);
		std::fill_n(ans,len,0);
		
		int n;
		std::cin>>n;
		for(int i=0;i<n;i++){
			std::cin>>arr[i];
		}
		
		for(int i=n-2;i>=0;i--){
			if(arr[i+1]>=arr[i]){
				ans[i]=ans[i+1]+1;
			}
		}
//		for(int i=0;i<n;i++){
//		printf("%d ",ans[i]);
//		}
		
		ull fin_l=0;
		ull i=0;
		ull y;
		
		while(i<n){
			y = ans[i];
			fin_l+=(y+1)+((y*(y+1))/2);
			i+=y+1;
//			printf("%d ",i);
		}
		printf("%lld \n",fin_l);
	}
}
