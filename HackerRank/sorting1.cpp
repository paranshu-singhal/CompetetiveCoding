#include<iostream>
#include<stdio.h>

int main(){
	int arr[1005];
	int v,n;
	
	std::cin>>n;
	for(int i=0;i<n-1;i++){
		std::cin>>arr[i];
	}
	arr[n-1]=0;
    std::cin>>v;
    
    int k=n-2;
    while(v<arr[k]){
    	arr[k+1]=arr[k];
    	k--;
       for(int i=0;i<n;i++){
       	std::cout<<arr[i]<<" ";
       }
       printf("\n");
	}
	arr[k+1]=v;
	for(int i=0;i<n;i++){
       	std::cout<<arr[i]<<" ";
       }
    printf("\n");
}
