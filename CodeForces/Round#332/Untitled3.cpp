#include<bits/stdc++.h>
#define len 100005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
typedef float fl;
typedef long double db;
ll arr[len];
ll premax[len];
ll sufmin[len];
int main(){
	int n;
	cin>>n;
	For(i,0,n) cin>>arr[i];
	
	ll mn=INT_MIN;
	For(i,0,n){
		if(arr[i]>mn){
			mn=arr[i];
			
		}
		premax[i]=mn;
	}
	
	mn=INT_MAX;
	Forr(i,n-1,0){
		if(arr[i]<mn){
			mn=arr[i];
		}
		sufmin[i]=mn;
	}
//	For(i,0,n) cout<<premax[i]<<" ";cout<<"\n";
//	For(i,0,n) cout<<sufmin[i]<<" ";
	ll ans=0;
	For(i,0,n-1){
		if(premax[i]<=sufmin[i+1]) ans++;
	}
	cout<<ans+1<<"\n";
}

