#include<bits/stdc++.h>
typedef long long ll;
#define len 1000005
#define M 1000000007
ll arr[len];
int main(){
	ll calc(ll);
	arr[0]=0;
	arr[1]=1;
	arr[2]=1;
	for(int i=3;i<len;i++){
		arr[i]=(arr[i-1]+arr[i-2])%M;
	}
	ll t,n,m;
	std::cin>>t;
	while(t--){
		std::cin>>n;
		std::cin>>m;
		std::cout<<(calc(n+2)-1)%m<<"\n";
	}
}

ll calc(ll n){
	if(n<len)	return arr[n];
	ll k=n/2;
	
	ll a=calc(k+1);
	ll b=calc(k);
	
	if (n%2==1) { // n=2*k
		return (a*a + b*b) % M;
	} else { // n=2*k+1
		return (b*(2*a-b)) % M;
	}
}
