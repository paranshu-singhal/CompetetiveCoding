#include<bits/stdc++.h>
#define MOD 1000000007
typedef long long ll;
using namespace std;
int main(){
	std::string str;
	std::cin>>str;
	
	ll len = str.size();
//	std::cout<<"len"<<len<<"\n";
//	ll cnt=0;
	long long int res = 0;
    long long int f = 1;
   for(int i = len-1; i >= 0; i--) {
       res = (res + (str[i]-'0')*f*(i+1)) % MOD;
       std::cout<<res<<"\n";
       f = (f*10+1) % MOD;
}
std::cout<<res;
}


