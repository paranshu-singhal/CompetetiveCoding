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
//ll arr[len];
int main(){
string s1;
string s2;
cin>>s1>>s2;
ll n1=s1.size();
ll n2=s2.size();

ll ans=0;
For(i,0,n2-n1+1){
	For(j,0,n1){
		ans+=(((int)s1[j])-48)^(((int)s2[i+j])-48);
	}
}
cout<<ans<<"\n";
}
