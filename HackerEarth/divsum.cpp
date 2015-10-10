#include<stdio.h>
#include<math.h>
typedef long long ll;
int main(){
	ll t;
	scanf("%lld",&t);
	while(t--){
		ll n;
		scanf("%lld",&n);
		if (n>1 && n<=500000){
		
		ll s=0;
		for(ll i=2;i<=(int)sqrt(n);i++){
			if((n%i)==0){
				s+=i;
				ll temp=n/i;
				if(temp!=i){
				  s+=temp;
				}
				
			}
		}
		printf("%lld \n",s+1);
	}
    else if(n==1){
    	printf("0 \n");
    }
    else{
    	printf("\n");
    }
}

}
