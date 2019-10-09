#include<iostream>
#include<stdio.h>
#include<cstdlib>
typedef long long ll;
using namespace std;
int main(){
	ll t;
	std::cin>>t;
	while(t--){
	ll m;
	std::cin>>m;
	ll sum=0;
	ll mod = 100000000;
	for(int i=0;i<m;i++){
		ll v;
		std::cin>>v;
		sum=((sum%m)+(v%m))%m;
	}
    
	if(sum==0){
		printf("YES \n");
	}
	else{
		printf("NO \n");
	}
    }
    return 0;
}

