#include<bits/stdc++.h>
#define len 100005
typedef double dd;
int main(){
	
	dd ptr[len];
	int n;
	std::cin>>n;
	for(int i=0;i<n;i++){
		std::cin>>ptr[i];
	}
	dd sum=0;
	for(int i=0;i<n;i++){
		sum+=ptr[i];
		ptr[i]=sum;
//		std::cout<<ptr[i];
	}
	
    
	int q;
	std::cin>>q;
	while(q--){
		int l,r;
		std::cin>>l;
		std::cin>>r;
		dd ans;
		ans=ptr[r-1]-ptr[l-2];
	//	else ans=ptr[l-1];
		std::cout << std::fixed;
	    std::cout << std::setprecision(6);
		std::cout<<ans/(r-l+1)<<"\n";
	}
}
