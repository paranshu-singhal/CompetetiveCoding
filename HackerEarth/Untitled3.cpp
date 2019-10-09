#include<stdio.h>
#include<algorithm>
using namespace std;
int main(){
 
 int t;
  scanf("%d",&t);	
  for(int k=1;k<=t;k++){
  
  printf("Scenario #%d: \n",k);  	
  int tot,n;	
  
  scanf("%d",&tot);
  scanf("%d",&n);
  
  int a[n+1];
  
  for(int i=0;i<n;i++){
  	scanf("%d",&a[i]);
  }
  std::sort(a, a+n);
  
  int ans=0;
  bool flag=1;
  for(int i=n-1;i>=0;i--){
  	ans+=a[i];
  	if(ans>=tot){
  		printf("%d \n \n",n-i);
  		flag=0;
  		break;
  	}
  }
  if(flag){
  	printf("impossible \n \n");
  }
  
}

}

