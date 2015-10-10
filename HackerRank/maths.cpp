#include<iostream>
#include<algorithm>
#define len 10005
using namespace std;
typedef long long ll;
int main(){
 ll rrr[len]={0,1,2,4,10};
 for(ll i=5;i<len;i++){
 //	std::cout<<i;
 	rrr[i] = rrr[i-1]+((i-1)*rrr[i-2]);
}

 ll t;
 std::cin>>t;
 while(t--){
 	ll m;
 	std::cin>>m;
 	std::cout<<rrr[m]<<"\n";
 }
 
}
