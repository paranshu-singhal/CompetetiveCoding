#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(){
	int t;
	scanf("%d",&t);
	while(t--){
		char str[5][1000];
		
		int ans;
		for(int i=0;i<5;i++){
		
		scanf("%s",&str[i]);
		
		char *ch=strchr(str[i],'m');
		if(ch!=NULL){
			ans=i;
		}
		
		}
		if (ans==0){
			int a = atoi(str[4]) - atoi(str[2]);
			printf("%d + %s = %s \n",a,str[2],str[4]); 
		}
		else if(ans==2){
			int a = atoi(str[4]) - atoi(str[0]);
			printf("%s + %d = %s \n",str[0],a,str[4]);
		}
		else{
			int a = atoi(str[0]) + atoi(str[2]);
			printf("%s + %s = %d \n",str[0],str[2],a);
		}
		
		
		
	}
}
