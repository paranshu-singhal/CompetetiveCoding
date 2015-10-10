#include<cstdlib>
#include <cstdio>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
   int t;
   std::cin>>t;
    while(t--){
        int ptr[10005];
        int m,n;
        std::cin>>m;std::cin>>n;
        for(int i=0;i<n;i++){
            std::cin>>ptr[i];
        }
        bool f=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
            //	std::cout<<i<<j;
               if(ptr[i]+ptr[j]==m){
                   std::cout<<i+1<<" "<<j+1<<"\n";
                   break;
                   f=1;
               } 
            }
         if(f){
         	break;
         }
	   }
        
    }
    return 0;
}
