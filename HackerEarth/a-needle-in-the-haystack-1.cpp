#include<bits/stdc++.h>
#define len 28
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
typedef float fl;
typedef long double db;
ll txt[len];
ll ptr[len];
int main(){
	bool check();
	int t;
	cin>>t;
	while(t--){
		memset(txt,0,sizeof(txt));
		memset(ptr,0,sizeof(ptr));
		
		string str1,str2;
		cin>>str1>>str2;
		ll n,m;
		n=str1.size();
		m=str2.size();
		if(n>m) cout<<"NO\n";
		else{
		
		For(i,0,n){
			ptr[str1[i]-'a']++;
			txt[str2[i]-'a']++;
		}
//		For(i,0,26) cout<<ptr[i]<<" ";
		bool f=1;
		if(check()) cout<<"YES\n";
		else{
		For(i,1,m-n+1){
			txt[str2[i+n-1]-'a']++;
			txt[str2[i-1]-'a']--;
			if(check()){
			cout<<"YES\n";f=0;break;	
			}
		}	
		if(f) cout<<"NO\n";
		}
	}
	}
}

bool check(){
	For(i,0,26){
		if(txt[i]!=ptr[i]) return false;
	}
	return true;
}
