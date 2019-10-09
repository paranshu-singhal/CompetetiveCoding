#include<bits/stdc++.h>
#define len 1000005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<=b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
ll arr[len];
ll mxx[len];
ll mnn[len];
ll pox[len];
ll pom[len];
int main(){
	ll n;
	cin>>n;
	For(i,1,n) cin>>arr[i];
	mxx[1]=arr[1]; pox[1]=1;
	mnn[1]=arr[1]; pom[1]=1;
	ll ans=1,ans_f=0;
	
	For(i,2,n){
		if(arr[i]>mxx[i-1]){
			mxx[i]=arr[i];
			pox[i]=i;
			mnn[i]=mxx[i-1];
			pom[i]=pox[i-1];
			ans=i-pom[i]+1;
		}
		else if(arr[i]<mnn[i-1]){
			mnn[i]=arr[i];
			pom[i]=i;
			mxx[i]=mnn[i-1];
			pox[i]=pom[i-1];
			ans=i-pox[i]+1;
		}
		else{
			mxx[i]=mxx[i-1];pox[i]=pox[i-1];
			mnn[i]=mnn[i-1];pom[i]=pom[i-1];
			ans++;
		}
	if(ans_f<ans) ans_f=ans;
	}
	cout<<ans_f;
}
