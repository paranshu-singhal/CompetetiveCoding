#include<bits/stdc++.h>
#define len 185
typedef float fl;
int main(){
int t;
std::cin>>t;
while(t--){
	
	fl ang;
	std::cin>>ang;
	if(ang==0){
		printf("00:00 \n");
	}
	else if(ang==90){
		printf("03:00 \n09:00 \n");
	}
	else{
		printf("06:00 \n");
	}
	
}

}
