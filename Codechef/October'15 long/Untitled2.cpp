#include<bits/stdc++.h>
#define len 1005
typedef long long ll;
int main(){
	int t;
	std::cin>>t;
	
	while(t--){
		ll arr[len];
		std::string str1;
		std::string str2;
		
		int n;
		std::cin>>n;
		std::cin>>str1;
		std::cin>>str2;
		for(int i=0;i<=n;i++){
			std::cin>>arr[i];
		}
		
		ll mx=0;
		ll mx_h=0;
		for(int i=0;i<n;i++){
			if(str1[i]==str2[i])  mx++;
//			else mx=0;
//			if(mx>mx_h) mx_h=mx;
		}
	if(mx==n) printf("%lld \n",arr[n]);
	else printf("%lld \n",*std::max_element(arr,arr+mx+1));
	}
}
