#include<bits/stdc++.h>
#define len 100005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
ll arr[len];
int main(){
	int t;
	cin>>t;
	while(t--){
		int n,m;
		cin>>n>>m;
		bool ptr[m];
		memset(ptr,0,sizeof(ptr));
		
		For(i,0,n) cin>>arr[i];
		
		ll i=0,sum=0;
		while(i<n){
			sum=0;
			For(j,i,n){
//				cout<<"i"<<i<<"j"<<j<<"\n";
				sum+=arr[j];
				if(sum<=m) ptr[sum%m]=1;
				else {
				break;} 
			}
		i++;
		}
		Forr(i,m-1,0){
			if(ptr[i]) cout<<i<<"\n";
		}
	}
}
