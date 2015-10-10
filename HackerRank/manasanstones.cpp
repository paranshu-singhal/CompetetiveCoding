#include<iostream>
using namespace std;
int main(){
	int t;
	std::cin>>t;
	while(t--){
		int n;
		std::cin>>n;
		int a,b;
		std::cin>>a;std::cin>>b;
		if(a>b){
			a=a+b;
			b=a-b;
			a=a-b;
		}
	   if(a!=b){
		
		for(int i=0;i<n;i++){
			int cnt = (a*(n-i-1))+(b*(i));
			std::cout<<cnt<<" ";
		}
		std::cout<<"\n";
     }
 	else{
	 std::cout<<a*(n-1)<<"\n";	
	}
	}
}
