#include<bits/stdc++.h>
#define len 1000005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
typedef float fl;
typedef long double db;

ll arr[len];
ll dp[len];

int main(){
	memset(dp,0,sizeof(dp));
	memset(arr,0,sizeof(arr));
	
	int n,mx=0;
	cin>>n;
	ll a,b;
	For(i,0,n){
		cin>>a>>b;
		arr[a]=b;
	}
	if(arr[0]>0) dp[0]=1;
	For(i,1,len){
		if(arr[i]==0) dp[i]=dp[i-1];
		else{
		if(arr[i]>=i) dp[i]=1;
		else dp[i]=dp[i-1-arr[i]]+1;
		} 
	if(mx<dp[i]) mx=dp[i];
	}
//	For(i,0,20) cout<<arr[i]<<" ";
//	cout<<endl;
//	For(i,0,20) cout<<dp[i]<<" ";cout<<endl;
 cout<<n-mx<<"\n";
 return 0;
}
