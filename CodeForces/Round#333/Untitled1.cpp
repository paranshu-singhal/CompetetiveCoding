#include<bits/stdc++.h>
#define len 15
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
typedef float fl;
typedef long double db;
ll ax[len];
ll bx[len];
int main(){
	ll power(ll,ll);
	
	ll n1,n2,a,b;
	cin>>n1>>a;
	For(i,1,n1+1) cin>>ax[i];
	cin>>n2>>b;
	For(i,1,n2+1) cin>>bx[i];
	
	ll ans1=0,ans2=0;
	Forr(i,n1,1){
		ans1+=ax[i]*power(a,n1-i);
	}
	Forr(i,n2,1){
		ans2+=bx[i]*power(b,n2-i);
	}
	if(ans1>ans2) cout<<">";
	else if(ans1<ans2) cout<<"<";
	else cout<<"=";
}

ll power(ll x,ll y)
{
    if( y == 0)
        return 1;
    else if (y%2 == 0)
        return power(x, y/2)*power(x, y/2);
    else
        return x*power(x, y/2)*power(x, y/2);
 
}
