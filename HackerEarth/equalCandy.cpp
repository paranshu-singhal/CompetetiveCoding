#include<bits/stdc++.h>
#define len 1005
typedef unsigned int ui;

int main(){
	int t;
	std::cin>>t;
	ui arr[len];
	ui min_n(ui,ui,ui);
	
	while(t--){
		int n;
		std::cin>>n;
		std::fill_n(arr,len,INT_MAX);
		
		ui mx=0;
		ui p;
		for(int i=0;i<n;i++){
			
			std::cin>>p;
			arr[p]=0;
			if(p>mx){
				mx=p;
			}
		}
		
		for(int i=2;i<=mx+10;i++){
			arr[i]=min_n(arr[i-1]+1,arr[i-2]+1, arr[i-5]+1);
			printf("%d %d \n",i,arr[i]);
		}
		printf("%d \n",*std::min_element(arr+mx-1,arr+mx+5));
	}
}

ui min_n(ui a,ui b,ui c){

	if(a<b and a<c){return a;}
	else if(b<a and b<c){return b;}
	else if(c<b and c<a){return c;}
}
