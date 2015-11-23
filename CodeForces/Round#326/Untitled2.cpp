#include<bits/stdc++.h>
#define len 1000000
typedef long long ll;
int main(){
	
	
	ll n;
	std::cin>>n;
//	std::fill_n(arr,len,0);
//	for(ll i=2;i<1000000;i++){
//		arr[i*i]=1;
//	}
	ll i=2;
	while(i<=len){
		
		ll t=i*i;
		if(t<=n){
			if(n%t==0) n/=i;
			else i++;
		}
		else break;
	}
std::cout<<n;
}
