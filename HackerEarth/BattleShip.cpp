#include<stdio.h>

using namespace std;

int main(){
int x1,x2,y;	
int count=0;
int solve(int,int);

int t;
scanf("%d", &t);

while(t--){
scanf("%d", &x1);scanf("%d", &x2);scanf("%d", &y);
for(int i=x1; i<=x2; i++){
	 if(i!=0){
	 bool ans = solve(i,y);
	  if(ans){
	  	count++;
	  }
	  }}
printf("%d",count);
}
}

bool solve(int x, int y){
// x y m i tempy
int tempy=0; bool flag=1;
	bool isInt(float);
   float m = (y/x);
	if(m<0){
		int i=-1;
		while(tempy<y && i>x){
			tempy=m*i;
		//	std::cout<<"tempy: "<<tempy;
			if(isInt(tempy)){
			flag=0;
			break;
			}
			else{
				i--;
			}
		}
	}
	else{
		int i=1;
		while(tempy<y && i<x){
			tempy=m*i;
			if(isInt(tempy)){
			flag=0;
			break;
			}
			else{
				i++;
			}
		}
	}
	return flag;
	
}

bool isInt(float a){
	
	int m = (a/2)*2;
	if(m==a){
		return 1;
	}
	else{
		return 0;
	}
}
