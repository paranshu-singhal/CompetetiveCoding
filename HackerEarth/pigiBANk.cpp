#include<stdio.h>
#include<algorithm>
#include<climits>
using namespace std;
typedef int ll;
int main(){
	ll t;
	scanf("%d",&t);
	while(t--){
		
		ll w,n;
		scanf("%d",&w);
		scanf("%d",&n);
		n=n-w;
		ll r[n+1];
		for(int i=0;i<=n;i++){
			r[i]=INT_MAX;
		}
		
		ll k;
		scanf("%d",&k);
		ll first,c,d;
		for(int i=0;i<k;i++){
		 scanf("%d",&c);	
		 scanf("%d",&d);
		 if(i==0){
		 	first=d;
		 }
		 r[d]=c;
		 }
		 for(int j=first;j<=n;j++){
		 	if(j>1){
		 	ll q=INT_MAX;
		 	for(int i=1;i<=(j/2);i++){
		 		ll temp[]={q,r[j],(r[i]+r[j-i])};
		 		q=*std::min_element(temp, temp+3);
		 	}
		 	r[j]=q;
	     }
		 }
	   
	    if(r[n]<INT_MAX){
	     printf("The minimum amount of money in the piggy-bank is %d. \n",r[n]);
	   }
	   else{
	   	printf("This is impossible.\n");
	   }
	}
}


