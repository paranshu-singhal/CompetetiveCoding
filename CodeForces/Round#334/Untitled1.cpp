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

int main(){
db m[len];
db w[len];
db h[3];
db wt[5]={500,1000,1500,2000,2500};

For(i,0,5) cin>>m[i]; 	
For(i,0,5) cin>>w[i];
For(i,0,2) cin>>h[i];

db ans=0;

For(i,0,5){
	ans+=max(0.3*wt[i],(1-(m[i]/250))*wt[i]-(50*w[i])) ;	
}
ans+=(h[0]*100)-(50*h[1]);
cout<<(ans);
}
