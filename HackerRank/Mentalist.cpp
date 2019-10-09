#include<iostream>
#include<cstring>
#include<cmath>
#define len 218000
bool primes[len];
int main(){
	void calc_k();
	int ptr[50]={1,1,1,1};
	
	for(int i=4;i<41;i++){
			 ptr[i]=ptr[i-1]+ptr[i-4];	
    //         std::cout<<ptr[i]<<" "; 
      }
calc_k();			
int t;
std::cin>>t;
	while(t--){
		int k;
		std::cin>>k;
		k = ptr[k];
	//	std::cout<<k<<" ";
		int cnt=0;
		for(int i=2;i<=k;i++){
			if(primes[i]==0){
	//			std::cout<<i<<" ";
				cnt++;
			}
		}
	std::cout<<cnt<<"\n";	
	
	}

} BigInt

void calc_k(){
    
    memset(primes,0,sizeof(primes));
	for(int i=2;i<sqrt(len);i++){
		for(int j=2*i;j<len;j+=i){
			if(primes[j]==0){
				primes[j]=1;
			}
		}
	}
//for(int i=0;i<30;i++){
//	std::cout<<primes[i]<<" ";
//}

}
