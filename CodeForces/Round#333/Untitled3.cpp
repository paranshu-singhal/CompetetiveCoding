#include<bits/stdc++.h>
#define len 403
#define For(i,a,b) for(ll i=a;i<=b;i++)
using namespace std;
typedef long long ll;
queue<ll> fir;

ll arr[len][len];
ll wet[len];
bool color[len];

int main(){
	
memset(arr,0,sizeof(arr));
memset(color,0,sizeof(color)); //0 white
fill_n(wet,len,INT_MAX);
wet[1]=0;
fir.push(1);
int n,m;
cin>>n>>m;
For(i,1,m){
	int a,b;
	cin>>a>>b;
	arr[a][b]=1;
	arr[b][a]=1;
}
ll temp=0;
For(i,1,n){
if(arr[i][n]==1) temp++;	
}
//cout<<"temp "<<temp<<"\n";
if(temp==n-1 or temp==0){
	cout<<"-1";
}
else{

const bool veh=!(arr[1][n]);
while(!fir.empty()){
For(i,1,n){
	color[fir.front()]=1;
	if(arr[fir.front()][i]==veh and i!=fir.front() and color[i]!=1){
		if(wet[i]>wet[fir.front()]+1){
		wet[i]=wet[fir.front()]+1;
		fir.push(i);	
		} 
	}
}
fir.pop();
}
//For(k,1,n) cout<<wet[k]<<" ";
cout<<max(ll(1),wet[n]);
//cout<<wet[n];
}
}
