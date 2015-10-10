#include<stdio.h>
#include<limits.h>
int main(){
	int t;
	scanf("%d",&t);
	while(t--){
		int m,n;
		int sum=0,j=0,min=INT_MAX,cnt=0,min_cnt=0;
		scanf("%d",&m);
		scanf("%d",&n);
		
		int arr[m+2];
		
		for(int i=0;i<m;i++){
			scanf("%d",&arr[i]);
		}
		for(int i=0;i<m;i++){
		//	printf("%d",i);
			sum+=arr[i];
			cnt++;
			if(sum>n){
				while(sum>n){
					sum-=arr[j++];
				    cnt--;
				}
			}
			if(cnt>min_cnt){
				min_cnt=cnt;
				min=sum;
			}
			else if(cnt==min_cnt && sum<min){
				min=sum;
			}
		}
	  printf("%d %d",min,min_cnt);
	}
}
