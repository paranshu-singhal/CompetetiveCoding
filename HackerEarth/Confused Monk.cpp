#include<bits/stdc++.h>
#define len 100005
#define Mod 1000000007
#define For(i,a,b) for(int i=a;i<b;i++)
using namespace std;
typedef long long ll;
int main(){
int gcd(int,int);
int n;
cin>>n;
int arr[n+2];
ll g=1;
ll f=0;
For(i,0,n) cin>>arr[i],g=(g*arr[i])%Mod;
//sort(arr,arr+n);
For(i,0,n) f=gcd(f,arr[i]);
cout<<ll(pow(g,f))%Mod; 
}

int gcd(int a,int b){
	if(a==0) return b;
	else gcd(b%a,a);
}
