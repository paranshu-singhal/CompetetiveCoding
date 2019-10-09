#include<iostream>
#include<stdio.h>
#include<string.h>
#include<limits.h>
using namespace std;
int main(){
//	int t;
//	std::cin>>t;
//	while(t--){
	
	int n,m;
	scanf("%d", &n);
	scanf("%d", &m);
	
	int S[n+2];
	
	for(int i=0;i<m;i++){
	 std::cin>>S[i];	
	}
	int f[1000];
	
	memset(f,0,sizeof(f));
	
	f[0]=1;
	
	 for(int i=0; i<m; i++)
        for(int j=S[i]; j<=n; j++)
            f[j] += f[j-S[i]];
 
    printf("%d", f[n]);
}

	

