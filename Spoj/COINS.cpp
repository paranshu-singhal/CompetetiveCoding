#include<bits/stdc++.h>
#define len 10000005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)

using namespace std;
typedef long long ll;
ll arr[len]={0,1,2,3};
int main(){
ll count(ll);
For(i,4,len){
	arr[i]=max(i,arr[i/2]+arr[i/3]+arr[i/4]);
//	cout<<arr[i]<<"\n";
}
//cout<<"yah";
ll n;
while(scanf("%lld",&n)>0){
	cout<<count(n)<<"\n";
}
}
ll count(ll n){
	if(n<len) return arr[n];
	else{
		return max(n,count(n/2)+count(n/3)+count(n/4));
	}
}

