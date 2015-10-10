#include<bits/stdc++.h>
using namespace std;
int main(){
	int t;
	std::cin>>t;
	int low[26],up[26];
	while(t--){
		std::string x;
		std::string y;
		std::cin>>x;
		std::cin>>y;
		
		std::fill_n(low,26,0);
		std::fill_n(up,26,0);
		
		for(int i=0;i<x.size();i++){
			int a=int(x[i]);
			if(a>=65 and a<=90){
				up[a-65]++;
			}
			else if(a>=97 and a<=122){
				low[a-97]++;
			}
		}
		
		for(int i=0;i<y.size();i++){
			int a=int(y[i]);
			if(a>=65 and a<=90){
				up[a-65]++;
			}
			else if(a>=97 and a<=122){
				low[a-97]++;
			}
		}
		
		int mx2=*std::max_element(low,low+26);
		int mx1=*std::max_element(up,up+26);
		
		if(mx1>=mx2){
			std::cout<<char((*std::find(up,up+26,mx1))+65)<<"\n";
		}
		else{
			std::cout<<char((*std::find(low,low+26,mx2))+97)<<"\n";
		}
	
	}
}

