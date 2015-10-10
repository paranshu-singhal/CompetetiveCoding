#include<iostream>
#include<cstring>
#include<stdio.h>

int main()
 {   
   
    int max(int,int);
	int ratings[100];
	int num[100]; 
	int size;
	
	std::cin>>size;
	
	memset(num, 1, sizeof(num));
	for(int i=0;i<size;i++){
		num[i]=1;
	//	std::cout<<num[i];
	}
	
	for(int i=0;i<size;i++){
		std::cin>>ratings[i];
	}
	
    
    // if(size<=1)
     //    return size;
     
     for (int i = 1; i < size; i++)
     {
         if(ratings[i]>ratings[i-1])
             num[i]=num[i-1]+1;
     }
     for (int i= size-1; i>0 ; i--)
     {
         if(ratings[i-1]>ratings[i])
             num[i-1]=max(num[i]+1,num[i-1]);
     }
     int result=0;
     
	 for (int i = 0; i < size; i++)
     {
         result+=num[i];
   //     std::cout<<num[i]<<" ";
     }
    std::cout<<result;
     return 0;
 }
 
 int max(int a,int b){ return (a>b)?a:b;}
