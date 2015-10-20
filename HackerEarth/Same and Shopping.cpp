#include<bits/stdc++.h>
#define len 100005
#define For(i,a,b) for(int i=a;i<b;i++)
using namespace std;
typedef long long ll;
//ll arr[len];
//ll tail[len];
int main(){
	int min_3(int,int,int);
int t;
cin>>t;
while(t--){
	int n;
	cin>>n;
	int arr[n+1][3];
	int dp[n+1][3];
	For(i,0,n){
		For(j,0,3) cin>>arr[i][j];
	}
	For(i,0,3) dp[0][i]=arr[0][i];
	For(i,1,n){
		For(j,0,3){
			dp[i][j]=INT_MAX;
			For(k,0,3){
			if(j!=k){
			dp[i][j]=min(dp[i][j],dp[i-1][k]+arr[i][j]);	
			}	
			}}
	}
cout<<min_3(dp[n-1][0],dp[n-1][1],dp[n-1][2]);
}
}
int min_3(int a,int b,int c){
return (a<=b and a<=c)?a:(b<=a and b<=c)?b:c;
}
