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
ll a,b,c,n;
cin>>n>>a>>b>>c;
ll arr[n+2];

For(i,0,n) cin>>arr[i];
sort(arr,arr+n);
if(b>a) swap(a,b);
if(c>a) swap(c,a);
if(c>b) swap(b,c);
//cout<<a<<b<<c;
if(arr[n-1]>(a+b+c)){
	cout<<"-1 \n";
}
else if(arr[n-1]<=c){
	cout<<ceil(double(n)/3)<<"\n";
}
else{
	ll i=0,j=0,tot=c,cnt=1;
while(1){
	
	if(arr[n-1]>tot){
		if(cnt==1){tot+=b,cnt++;}
		else if(cnt==2){tot+=a,tot-=,cnt++; }
	}
}
}
} 
void swap(ll *a,ll *b){
	ll temp=*a;
	*a=*b;
	*b=temp;
}
