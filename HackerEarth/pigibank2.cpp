#include<stdio.h>
//#include<limits.h>
#include<algorithm>
#define INT_MAX 1000000
using namespace std;
int main(){
	int t;
	scanf("%d",&t);
	while(t--){
		int w1,w;
		scanf("%d",&w1);
		scanf("%d",&w);
		w=w-w1;
		
		int r[10005];
		for(int i=0;i<=w;i++){
			r[i]=INT_MAX;
		}
		
		int n;
		scanf("%d",&n);
		int first;
		for(int i=0;i<n;i++){
			int cc,wc;
			scanf("%d",&cc);
			scanf("%d",&wc);
			
			if(i==0){
				first=wc;
			}
			r[wc]=cc;
		}
		for(int j=first;j<=w;j++){
			if(j>1){
				int q;
				for(int i=1;i<=(j/2);i++){
				  q=std::min(r[j],r[i]+r[j-i]);	
				  if(q<r[j]){
					r[j]=q;
				  }
				}
		}
       }
	   //printf("%d \n",INT_MAX);      
		if(r[w]<INT_MAX){
	     printf("The minimum amount of money in the piggy-bank is %d. \n",r[w]);
	   }
	   else{
	   	printf("This is impossible. \n");
	   }
		
	
}
}
