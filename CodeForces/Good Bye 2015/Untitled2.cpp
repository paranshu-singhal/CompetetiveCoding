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
ll calc(ll);
ll power(ll,ll);
ll n,m;

cin>>n>>m;

ll mb=calc(m);
ll nb=calc(n);

//cout<<nb<<" "<<mb<<"\n";
bitset<sizeof(int) * CHAR_BIT>    bitsm(m);
bitset<sizeof(int) * CHAR_BIT>    bitsn(n);
//cout<<bitsm<<" "<<bitsn<<"\n";
ll m1=m,n1=n;
For(i,0,nb){
//	cout<<"a";
	if(bitsn[i]==0){ n1+=power(2,i); }
}
For(i,0,mb){
	if(bitsm[i]==0){ m1+=power(2,i); }
}
n1--;m1--;
//cout<<n1<<" "<<m1<<"\n";
ll ans=0,p=0;
while(n1>=n){
	if(n1>=n and n1<=m) ans++;
	n1-=power(2,p);
	p++;
	
}
//cout<<"ansn "<<ans<<" ";
p=0;
ans+=mb-1;
while(m1>=n){
	if(m1>m or m1<n) ans--;
	m1-=power(2,p);
	p++;
}

//cout<<"p"<<p<<" ";
For(i,nb+1,mb) ans+=(i-1);
cout<<ans;
}

ll calc(ll n){
ll bits = 0;
while (n > 255) {
  bits += 8;
  n >>= 8;
}
while (n > 0) {
  bits++;
  n >>= 1;
}
return bits;
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
