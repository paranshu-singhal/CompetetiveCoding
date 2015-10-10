#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef long long ll;
int main(){
	ll n;
	char br[30000];
	scanf("%lld",&n);
	scanf("%s",&br);
	
	ll ans=0;
	for(ll i=0;i<n;i++){
		if(br[i]=='('){
			ans+=1;
		}
		else{
			ans-=1;
		}
	}
	//printf("%lld",ans);
    for(ll k=0;k<10;k++){
    printf("Test %lld: \n",k+1);
	ll t;
	scanf("%lld",&t);
	
	while(t--){
		
		ll c;
		scanf("%lld",&c);
		if(c){
		
		if(br[c-1]=='('){
			ans-=2;
		}
		else{
			ans+=2;
		}
        }
        else{
        
		if(ans==0){
        	printf("YES \n");
        }
		else{
			printf("NO \n");
		}
	}
}
}
}
