#include<bits/stdc++.h>
#define len 1005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
typedef float fl;
typedef long double db;
ll arr[len][2];
int main(){
	ll n,s;
	cin>>n>>s;
	For(i,0,n){
		cin>>arr[i][0]>>arr[i][1];
	}
	ll ans=0;
	Forr(i,n-1,0){
		ans+=(s-arr[i][0]);
		if(arr[i][1]>ans) ans+=(arr[i][1]-ans);
		s=arr[i][0];
	}
	ans+=arr[0][0];
	cout<<ans<<"\n";
}
