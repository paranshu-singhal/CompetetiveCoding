#include<bits/stdc++.h>
#define len 105
typedef double fl;

int main(){
	
	fl min(fl,fl,fl);
	int t;
	std::cin>>t;
	while(t--){
		fl a,b,c;
		std::cin>>a;
		std::cin>>b;
		std::cin>>c;
		
		fl mn=min(a,b,c);
		
		printf("%.1f \n",mn/2);
	}
}

fl min(fl a,fl b,fl c){
	return (a<=b and a<=c)?a:(b<=a and b<=c)?b:c;
}
