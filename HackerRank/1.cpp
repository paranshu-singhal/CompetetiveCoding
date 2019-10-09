#include<iostream>
#include<algorithm>
#include<cmath>
typedef float ll;
using namespace std;
int main(){
	int len;
	std::cin>>len;
	
	float ptr[2];
	std::fill_n(ptr,2,0);
	
	std::string str;
	std::cin>>str;
	
    if(str[0]=='w'){
		ptr[0]++;
	}
	for(int i=1;i<len;i++){
	
		if(str[i]=='w'|| str[i]=='W'){
			ptr[0]++;
		}
		if(str[i]=='v' && str[i-1]=='v'){
			ptr[1]+=2;
		}
	}
	
	ll temp=ptr[1]+(2*ptr[0]);
	ll base = len-ptr[0]-ptr[1];
	
	ll min = ceil(temp/2);
	std::cout<<base+min<<" "<<base+temp;
//	std::cout<<ceil(ptr[1]/2)<<ptr[1]/2;
}
