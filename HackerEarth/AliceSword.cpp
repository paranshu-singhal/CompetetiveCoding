#include<stdio.h>
#include<math.h>
#include<algorithm>
typedef long long ll;
using namespace std; 
int main(){
	ll t;
	scanf("%lld",&t);
	while(t--){
		bool flag=0;
		ll n;
		scanf("%lld",&n);
		int *alice=(int*)calloc(n, sizeof(int));
		int *animal=(int*)calloc(n, sizeof(int));
		for(ll i=0;i<n;i++){
			scanf("%lld",alice+i);
		}
		std::sort(alice, alice+n);
		for(ll i=0;i<n;i++){
			scanf("%lld",animal+i);
		}
		std::sort(animal, animal+n);
		for(ll x=0;x<n;x++){
			if(*(animal+x)>*(alice+x)){
			    printf("NO");
			    flag=1; 
				break;
			}
		}
		if(flag==0) {printf("YES");}
	}
return 0;
}
