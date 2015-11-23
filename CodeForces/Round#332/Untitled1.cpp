#include<bits/stdc++.h>
#define len 1000005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
typedef float fl;
typedef long double db;
//ll arr[len];
int main(){

ll d1,d2,d3;
cin>>d1>>d2>>d3;
ll arr[4]={d1+d2+d3,d1+d3+d3+d1,d2+d3+d3+d2,d1+d1+d2+d2};
cout<<*min_element(arr,arr+4);
}
