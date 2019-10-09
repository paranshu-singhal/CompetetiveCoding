#include<iostream>
typedef long long ll;
int main(){
	
	ll t;
	std::cin>>t;
	while(t--){
	
	ll ptr[100005];
	ll m,n;
	std::cin>>n;
	std::cin>>m;
	
	for(ll i=0;i<n;i++){
		std::cin>>ptr[i];
	}
	
	ll k=0, l=0, sum=ptr[l], max=0;
	while(k<n){
		if(sum<m){
			l++;
			sum+=ptr[l];
		}
		else if(sum>=m || l>=n-1){
			sum-=ptr[k];
			k++;
		}
		if(sum>max && sum<m){
			max=sum;
			if(max==m-1){
				break;
			}
		}
	}
	std::cout<<max<<"\n";
}
}
