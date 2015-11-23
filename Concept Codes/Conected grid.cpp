#include<bits/stdc++.h>
#define len 12
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
bool arr[len][len];
int  ar2[len][len];
int ptr[8][2]={{1,1},{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1},{0,1}};
int ans[105];

int main(){
memset(arr,0,sizeof(arr));
memset(ar2,0,sizeof(ar2));
memset(ans,0,sizeof(ans));
int n,m;
cin>>n;
cin>>m;
For(i,1,n+1){
	For(j,1,m+1) cin>>arr[i][j];}	

ll temp=1;
For(i,1,n+1){
	For(j,1,m+1){
		if(arr[i][j]==1){
			For(k,0,8){
			 if(arr[i+ptr[k][0]][j+ptr[k][1]]==1 and ar2[i+ptr[k][0]][j+ptr[k][1]]>0){
			 	ar2[i][j]=ar2[i+ptr[k][0]][j+ptr[k][1]];
			 	ans[ar2[i+ptr[k][0]][j+ptr[k][1]]]++;
			 	break;
			 }
		}
		if(ar2[i][j]==0){ar2[i][j]=temp;ans[temp++]++;}
	}
	}
}

//For(i,1,n+1){
//	For(j,1,n+1){
//	cout<<ar2[i][j]<<" ";
//	}
//	cout<<"\n";
//	}

//For(i,0,10) cout<<ans[i];
cout<<*max_element(ans,ans+105);
}
