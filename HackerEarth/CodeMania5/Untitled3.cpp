#include<bits/stdc++.h>
#define len 1000005
int main(){
	
	bool sq[len];
	std::fill_n(sq,len,0);
	for(int i=2;i<1000;i++){
		for(int j=2;j<16;j++){
		
		double y=pow(i,j);
		if(y<len) sq[int(y)]=1;
		else break;
	}
	}
	sq[1]=1;
//	for(int i=0;i<=32;i++){
//		std::cout<<sq[i];
//	}
	int t;
	std::cin>>t;
	while(t--){
		int n;
		bool f=1;
		std::cin>>n;
		for(int i=1;i<=(n/2)+1;i++){
			if(sq[i]==1 and sq[n-i]==1) {
				std::cout<<"Yes \n";
				f=0;
				break;	
			}
		}
		if(f){
			std::cout<<"No \n";	
		}
	}
	
}
