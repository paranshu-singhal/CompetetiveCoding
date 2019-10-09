#include<iostream>
#include<algorithm>
using namespace std;
int main(){
	
	int count(int, int*);
	int t;
	std::cin>>t;
	
	while(t--){
	 int n;
	 std::cin>>n;
	 
	 int rrr[100][3];
	 for(int i=0;i<n;i++){
	 	std::cin>>rrr[i][0];
	 	std::cin>>rrr[i][1];
	 	std::cin>>rrr[i][2];
	 }
	 
	 int min = 0;
	 int ans=0;
	 for(int i=0;i<3;i++){
	 	if(rrr[0][i]<rrr[0][min]){
	 		min=i;
	 	}
	 }
//	 std::cout<<min<<"\n";
	 ans+=rrr[0][min];
	 int y=min;
	 for(int i=1;i<n;i++){
//	 	std::cout<<y<<"\n";
	 	y = count(y,rrr[i]);
	 	ans+=rrr[i][y];
	 }	
	 std::cout<<ans<<"\n";
	}
}

int count(int n, int rrr[]){
	if(n==0){
		if(rrr[1]<rrr[2]){
			return 1;
		}
		else{
			return 2;
		}
	}
	else if(n==1){
		if(rrr[0]<rrr[3]){
			return 0;
		}
		else{
			return 3;
		}
	}
	else{
		if(rrr[0]<rrr[1]){
			return 0;
		}
		else{
			return 1;
		}
	}
}
