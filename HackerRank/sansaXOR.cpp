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
		std::cin>>ptr[i];
	}
    ll ans=0;
    if(n%2==0){
    	ans=0;
    }
    else{
    	
    for(int i=0;i<n;i+=2){
    //	for(int j=i;j<n;j++){
    		ans^=ptr[i];
    //	}
    }
  }
std::cout<<ans<<"\n";
}
}
