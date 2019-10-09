#include<bits/stdc++.h>
#define len 505
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
typedef float fl;
typedef long double db;
int hor[len][len];
int vrt[len][len];
int fin[len][len];
int main(){
	
	memset(hor,0,sizeof(hor));
	memset(vrt,0,sizeof(vrt));
	memset(fin,0,sizeof(fin));
	
	int n,m;
	cin>>n>>m;
	
	string str[n+1];
	For(i,0,n) cin>>str[i];
//	For(i,0,n) cout<<str[i]<<"\n";
For(i,0,n){
	int c=0;
	For(j,1,m){
		if(str[i][j]=='.' and str[i][j-1]=='.'){
			hor[i][j]=++c;
		}
		else{ hor[i][j]=hor[i][j-1];
		}
	}
}
For(i,0,n){
	For(j,0,m){
		hor[i][j]+=hor[i-1][j];
//		cout<<hor[i][j]<<" ";
	}
//	cout<<"\n";
}
For(j,0,m){
	int c=0;
	For(i,1,n){
		if(str[i][j]=='.' and str[i-1][j]=='.'){
			vrt[i][j]=++c;
		}
		else{ vrt[i][j]=vrt[i-1][j];
		}	
	}
}	
For(i,0,n){
	For(j,0,m){
		vrt[i][j]+=vrt[i][j-1];
//		cout<<vrt[i][j]<<" ";
	}
//	cout<<"\n";
}
For(i,0,n){
	For(j,0,m){
		fin[i][j]=hor[i][j]+vrt[i][j];
//		cout<<fin[i][j];
	}
//	cout<<"\n";
}
ll q;
ll a,b,c,d,ans;
cin>>q;
while(q--){
	cin>>a>>b>>c>>d;
	a--;b--;c--;d--;
	ans=fin[c][d]-fin[c][b-1];
	if(a>0){ans=ans-fin[a-1][d]+fin[a-1][b-1];}
//	ans=0;
//	cout<<ans<<"\n";
	if(a>0){
	For(i,b,d+1){
		if(str[a-1][i]=='.' and str[a][i]=='.'){ans--; } }
	}
//	cout<<a<<b<<c<<d;
//	cout<<ans<<"\n";
	if(b>0){
	For(j,a,c+1){
		if(str[j][b-1]=='.' and str[j][b]=='.'){ans--; } }
	}
	cout<<ans<<"\n";
}
}
