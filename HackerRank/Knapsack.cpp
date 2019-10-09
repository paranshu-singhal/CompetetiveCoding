#include<bits/stdc++.h>
#define len 2005
using namespace std;

int main(){
	int t;
	std::cin>>t;
	while(t--){
		int n,k;
		std::cin>>n;std::cin>>k;
		
		int arr[len];
		bool ptr[len];
		std::fill_n(ptr,len,0);
		
		for(int i=0;i<n;i++){
			std::cin>>arr[i];
		}
		std::sort(arr, arr+n);
		for(int i=arr[0];i<=k;i++){
			for(int j=0;j<n;j++){
				if(arr[j]==i){
					ptr[i]=1;
					break;
				}
				else{
					int temp = i-arr[j];
					if(temp<0){temp=0;}
					if(ptr[temp]==1){
						ptr[i]=1;
						break;
					}
				}
			}
		}
	    int i=k;
	    while(i>0){
	    	if(ptr[i]==1){
	    		std::cout<<i<<"\n";
	    	    break;
			}
	    	i--;
	    	if(i==0){
	    		std::cout<<"0 \n";
	    	}
	    }
	}

} 
