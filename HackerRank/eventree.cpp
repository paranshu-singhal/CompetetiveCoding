#include<iostream>
#include<cstring>
#define len 100005
typedef long long ll;
int main(){

    int t;
    std::cin>>t;
    while(t--){
    
    ll ptr[len];
	ll n;
	std::cin>>n;
	
	memset(ptr,0,sizeof(ptr));
	for(ll i=0;i<n;i++){
		//int a;
		std::cin>>ptr[i];
	}
	ll ans=0;
	if(n%2!=0){
		ans=ptr[0]^ptr[n-1];
	}
   }
   else{
   	  ans=0;
	}
std::cout<<ans<<"\n";

return 0;
}
