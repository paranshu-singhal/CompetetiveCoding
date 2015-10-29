#include<bits/stdc++.h>
#define len 100005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
//ll arr[len];
const double s5=sqrt(5);
ll multiply(ll[][2], ll[][2]);
ll fibo(ll);
int main(){
	int t;
	cin>>t;
	while(t--){
	ll a,b;
	cin>>a>>b;
	printf("%lld\n",(fibo(b+2)-fibo(a+1)+Mod)%Mod);	
//ll a[2][2]={{1,2},{3,4}};
		//multiply(a,a);
		
//		For(i,0,2){For(j,0,2){cout<<a[i][j]<<" ";}cout<<"\n";}
	}
}

ll fibo(ll n){
	ll fib[2][2]={{1,1},{1,0}}; ll temp[2][2]={ {1 , 0 } , { 0 , 1}};
	while(n)
    {
        if(n&1){ multiply(temp , fib); }
        multiply(fib,fib);
        n/=2;
    }
    return temp[0][1];
}

ll multiply(ll a[][2], ll b[][2]){
	ll res[2][2]={{0,0},{0,0}};
	For(i,0,2){
		For(j,0,2){
			For(k,0,2){	res[i][j]=(res[i][j]+a[i][k]*b[k][j])%Mod;}
		}
	}
	For(i,0,2){For(j,0,2) {a[i][j]=res[i][j];}}
}



