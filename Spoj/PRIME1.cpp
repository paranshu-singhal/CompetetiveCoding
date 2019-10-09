#include<stdio.h>

#include<stdlib.h>

#include<math.h>

#define DIF_S 100000

using namespace std;


int cnt=0;

int myprimes[DIF_S];


int main(){
	
void populateP(int);

	int t;
	
scanf("%d",&t);

	
	while(t--){

		int m,n;

		scanf("%d",&m);

		scanf("%d",&n);

		
		

		bool primes[DIF_S];

		for(int i=0;i<DIF_S;i++){

			primes[i]=true;

		}
		
		populateP(n);

		
//for(int i=0;i<cnt;i++){

		//	printf("%d ",myprimes[i]);

		//}

		
for(int i=0;i<cnt;i++){
		int p=myprimes[i];

			int s1=m/p;

			s1*=p;

		for(int j=s1;j<=n;j+=p){

			if(j<m){

				continue;


				}

			else{

				primes[j-m]=false;


			}
			
} 
		}
	for(int i=0;i<cnt;i++)     
    
{                        if(myprimes[i]>=m && myprimes[i]<=n)
 
    printf("%d \n",myprimes[i]);          
    
}
	
for(int i=0;i<n-m+1;i++) 
    
{
    if(primes[i] == true && (i+m)!=1) 
    
{	printf("%d \n",i+m); } 
    }

}

}







void populateP(int n){
	
	
	int size=floor(sqrt((double)n));
	
	bool primes[size];
	
	
	for(int i=0;i<=size;i++){
		
	primes[i]=true;
		
	myprimes[i]=0;
	}
	
	
	int max=floor(sqrt((double)size));
	
	
	for(int i=2;i<=max;i++){

		
		if(primes[i]){

		
		for(int j=(2*i);j<=size;j+=i){
			
			
				primes[j]=false;

		}
      
}
}
	
cnt=0;
	
for(int i=2;i<=size;i++){
		
if(primes[i]==true){
			
			
myprimes[cnt++]=i;
		
}
	}
