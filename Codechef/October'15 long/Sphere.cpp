#include<bits/stdc++.h>
#define len 10005
#define M 1000000007
typedef long long ll;
int upp[len];
int low[len];
ll rad[len];
ll ans[len];
int main(){
	int n,m,c;
	std::cin>>n;
	std::cin>>m;
	std::cin>>c;
	
	std::fill_n(upp,len,0);
	std::fill_n(low,len,0);
	
	for(int i=0;i<n;i++){
		int p;
		std::cin>>p;
		upp[p]+=1;
	}
	for(int i=0;i<n;i++){
		int p;
		std::cin>>p;
		low[p]+=1;
	}
	
	for(int i=0;i<n;i++){
		rad[i]=low[i]*upp[i];
	}
	ans[0]=rad[0];
	ans[1]=rad[1];
	ll y=1;
	for(int i=2;i<len;i++){
		ll temp=pow(2,i-1);
		ans[y+=temp]=rad[i];
	}
	
	for(int i=0;i<50;i++){
		std::cout<<ans[i]<<" ";
	}
}
