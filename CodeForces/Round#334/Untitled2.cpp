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
int main(){
ll n,k;
cin>>n>>k;
For(i,0,n) cin>>arr[i];

ll ans=0;
ll t=(2*k)-n;
ans=arr[n-1];
Forr(i,n-t-1,0){
ans=max(ans,arr[i]+arr[n-t-1-i]);
}
cout<<ans;
}
