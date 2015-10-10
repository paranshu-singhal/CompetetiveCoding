#include <stdio.h>
#include<limits.h> 
int main(){
	int min(int,int);
	int n,m;
	scanf("%d",&n);
	scanf("%d",&m);
	
	int arr[10000];
	
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	int k=0;
	int t = (n*(n+1))/2;
	int arr1[10000];
	
	for(int i=0;i<n;i++){
		int min_s=INT_MAX;
		for(int j=i;j<n;j++){
			min_s=min(arr[j],min_s);
			arr1[k]=min_s;
		    k++;
		}
	}
	
   char e,d;
   int s,cnt=0;
	
  for(int i=0;i<m;i++){
		scanf(" %c",&e);
	    scanf("%d",&s);
	    scanf(" %c",&d);

       cnt=0;
	    if(e=='<'){
	    	for(int x=0;x<k;x++){
	    		if(arr1[x]<s){
	    			cnt++;
	    		}
	    	}
	    }
		else if(e=='>'){
			for(int x=0;x<k;x++){
	    		if(arr1[x]>s){
	    			cnt++;
	    		}
	    	}
		}
		else{
			for(int x=0;x<k;x++){
	    		if(arr1[x]==s){
	    			cnt++;
	    		}
	    	}
		}
      
        
		if(cnt%2==0){
			if(d=='C'){
				printf("D");
			}
			else{
				printf("C");
			}
		}
		else{
			printf("%c",d);
		}	
	}
}
int min(int x,int y){return (x<y)?x:y;}
