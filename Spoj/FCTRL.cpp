#include<bits/stdc++.h>
#define len 100005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
ll cnt(ll);
int main(){
int t;
cin>>t;
while(t--){
	ll n;
	cin>>n;
	cout<<cnt(n)<<"\n";
}
}
ll cnt(ll n){
	ll count=0;
	
	for(ll i=5;(n/i)>=1;i*=5){
		count+=n/i;
	}
	return count;
}
