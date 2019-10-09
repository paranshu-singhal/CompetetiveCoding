#include<stdio.h>
#include<iostream>
using namespace std;

int main(){
	
	int len2;
	scanf("%d",&len2);
	char pat[len2];
	scanf("%s",&pat);
	
	int lps[len2+2];
	 
    lps[0]=0;
	int i=1,j=0;
	
   while(i<len2){
   	if(pat[i]==pat[j]){
   		lps[i]=j+1;
   		i++;
   		j++;
   		continue;
   }
   	else if(pat[i]!=pat[j] && j>0){
   		j=lps[j-1];
   	}
   	else{
   		lps[i]=0;
   	    i++;
	}
   	
   	}
   for(int k=0;k<len2;k++){
   printf("%d",lps[k]);
   }
return 0;
}





