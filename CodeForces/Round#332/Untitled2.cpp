#include<bits/stdc++.h>
#define len 100005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
typedef float fl;
typedef long double ld;
//ll arr[len];
//ll f[len];
ll b[len];
ll fc[len][2];

//int bc[len];

int main(){

//0 possible, 1 ambiguity, 2 impossible
ll n,m;
cin>>n>>m;
memset(fc,0,sizeof(fc));
//memset(bc,0,sizeof(bc));
ll temp;
For(i,0,n){
cin>>temp;
fc[temp][0]++;
fc[temp][1]=i;
}
For(i,0,m){
cin>>b[i];
}
//For(i,0,10) cout<<fc[i][0]<<" ";
//cout<<"\n";
//For(i,0,m) cout<<bc[i]<<" ";
bool amb=0;
For(i,0,m){
	if(fc[b[i]][0]>1){
		//cout<<"Ambiguity";
		//exit(0);
		amb=1;
	}
	if(fc[b[i]][0]==0){
		cout<<"Impossible";
		exit(0);		
	}
	else{
		b[i]=fc[b[i]][1];		
	}
}
if(amb) cout<<"Ambiguity";
else{
	cout<<"Possible \n";
	For(i,0,m){
		cout<<b[i]+1<<" ";
	}
}
}
