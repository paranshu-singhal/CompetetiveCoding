#include<bits/stdc++.h>
#define len 100005
int main(){
	int n;
	std::cin>>n;
	int wt[len];
	int pr[len];
	for(int i=0;i<n;i++){
		std::cin>>wt[i];
		std::cin>>pr[i];
	}
	int t,i=0,ans=0;
	while(i<n){
		ans+=(wt[i]*pr[i]);
		t=pr[i];
		i++;
		if(i<n){
			while(pr[i]>=t){
			ans+=(wt[i]*t); i++;	
		}	
		}
		
	}
std::cout<<ans;
}
