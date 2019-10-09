#include<bits/stdc++.h>
#define len 1000005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
using namespace std;
typedef long long ll;
bool arr[len];
int main(){
int t;
cin>>t;
while(t--){
	
fill_n(arr,len,1);
ll a,b;
ll ans=0;

cin>>a>>b;
For(i,2,ceil(sqrt(b))){
	ll k=1;
	ll j=i*i;
	while(j*k<a) k++;
	while(j*k<=b){
	arr[j*k-a]=0;
	k++;
	}
}
//cout<<ans<<"\n"; 
For(i,0,b-a+1){
	if(arr[i]==0) ans++;}
cout<<(b-a+1-ans)<<"\n";
}
}
