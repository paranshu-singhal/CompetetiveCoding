#include <iostream>
#include <bitset>
typedef unsigned long ul;
int main()
{   int t;
   std::cin>>t;
   while(t--){
   
	ul a;
	std::cin>>a;
	std::string binary = std::bitset<32>(a).to_string(); //to binary
   //  std::cout<<binary<<"\n";
    for(int i=0;binary[i]!='\0';i++){
   
    	if(binary[i]=='0'){
    		
    		binary.replace(i,1,"1");
    	}
    	else{
    		binary.replace(i,1,"0");
    	}
    }
 //   std::cout<<binary<<"\n";
    unsigned long decimal = std::bitset<32>(binary).to_ulong();
    std::cout<<decimal<<"\n";
}
}
