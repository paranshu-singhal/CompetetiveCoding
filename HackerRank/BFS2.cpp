#include<iostream>
#include<algorithm>
#include<climits>
#define len 10

using namespace std;
typedef int ll;

ll arr[len][len];
ll color[len];
ll wei[len];

int main(){
	ll bfs(ll);
	
	ll t;
	std::cin>>t;
	while(t--){
	
	
	ll n,m;
	std::cin>>n;
	std::cin>>m;
	
	
	std::fill_n(wei, len, INT_MAX);
	std::fill_n(color, len, 0);
	for(int i=0;i<len;i++){
		std::fill_n(arr[i], len, 0);
		arr[i][0]=INT_MAX;
	}
	
	for(int i=0;i<m;i++){
		ll a,b;
		std::cin>>a;
		std::cin>>b;
		arr[a][b]=1;
		arr[b][a]=1;
	}
	
	ll root;
	std::cin>>root;
	
	wei[root]=0;
	bfs(root);
	for(int i=1;i<=n;i++){
	  if(i!=root){
	  
		if(wei[i]==INT_MAX){
			std::cout<<"-1 ";
		}
		else{
			std::cout<<wei[i]*6<<" ";
		}
	}
}
std::cout<<endl;
}
}

ll bfs(ll root){
	
	ll relax(ll,ll);
	ll get_min(ll);
	
	color[root]=1;
//	std::cout<<root<<endl;
	for(int i=1;i<len;i++){
		if(arr[root][i]==1 && color[i]==0){
			relax(root, i);
		}
	}
	
	ll t=get_min(root);
//    std::cout<<"t "<<t<<endl;
//	for(int i=0;i<len;i++){
//		std::cout<<wei[i]<<" ";
//    }
if(t!=0){
 bfs(t);	
}	
return 0;
}

ll relax(ll r, ll t){
	
	ll temp = wei[r]+1;
	if(wei[t]>temp){
		wei[t]=temp;
	}
return 0;
}

ll get_min(ll root){
	ll min=0;
	
	for(int i=1;i<len;i++){
		if(wei[i]<wei[min] && color[i]==0 && i!=root){
			min=i;
			break;
		}
	}
	return min;
}
