#include<bits/stdc++.h>
#define len 100005
#define For(i,a,b) for(int i=a;i<b;i++)
using namespace std;
typedef long long ll;
int main(){
	int t;
	cin>>t;
	while(t--){
		int n,m;
		cin>>n>>m;
		
		int a[n+1][m+1];
		For(i,0,n){
		For(j,0,m) cin>>a[i][j];	}
		
		int mx=0;
		int dp[n+1][m+1];
		dp[0][0]=1;
		For(i,0,n){
			For(j,0,m){
				if((a[i][j]>a[i-1][j] and dp[i-1][j]!=0) or (a[i][j]>a[i][j-1] and dp[i][j-1]!=0)){
				dp[i][j]=max(dp[i-1][j],dp[i][j-1])+1;
				if(dp[i][j]>mx) mx=dp[i][j];	
				}
				else dp[i][j]=0;
			}
		}
	cout<<mx<<"\n";
	}
}
