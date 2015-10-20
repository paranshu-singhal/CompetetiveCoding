#include<bits/stdc++.h>
#define len 105
#define FOR(a,b) for(int i=a;i<b;i++)
using namespace std;
typedef long long ll;
int main(){
	int arr[len];
	int n,k;
	cin>>n;
	cin>>k;
	FOR(0,n){	cin>>arr[i]; }
	sort(arr,arr+n);
	
	int i=n-1;
	int j=1;
	int l=1;
	
	
	ll ans=0;
	while(i>=0){
		ans+=arr[i]*j;
//		std::cout<<ans<<" ";
		if(l==k){j++;l=0;}
		l++;
		i--;
	}
	printf("%lld \n",ans);
}
