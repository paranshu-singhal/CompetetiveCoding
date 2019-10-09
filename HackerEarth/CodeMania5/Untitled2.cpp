#include<bits/stdc++.h>
int ans[300];
int main(){
	int c[55];
	
	
	int n,m;
	std::cin>>n;
	std::cin>>m;
	std::fill_n(ans,300,0);
	for(int i=0;i<m;i++){
		std::cin>>c[i];
	}
	ans[0]=1;
	for(int i=0;i<m;i++){
		for(int j=c[i];j<=n;j++){
			ans[j]+=ans[j-c[i]];
		}
	}
	std::cout<<ans[n];	
}


