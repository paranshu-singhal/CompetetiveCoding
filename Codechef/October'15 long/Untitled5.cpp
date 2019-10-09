#include<bits/stdc++.h>
#define len 5000000
typedef long long li;
bool seive[len];
bool ans[len];
int main(){
		
	std::fill_n(seive,len,1);
	for(int i=2;i<len;i++){
	if(seive[i]){
			for(int j=i+i;j<len;j+=i){
			seive[j]=0;
		}	
		}
	}
	
	std::fill_n(ans,len,0);
	for(float i=2;i<len;i++){
		if(seive[int(i)]){
			float t = (i-1)/4;
			if(ceilf(t)==t){
				for(int j=i;j<len;j+=i){
					ans[j]=1;
			}
		}
			
	}
	
}
	int t;
	scanf("%d",&t);
	while(t--){
		int n;
		scanf("%d",&n);
		if(ans[n]) printf("YES\n");
		else printf("NO\n");
	}
}
