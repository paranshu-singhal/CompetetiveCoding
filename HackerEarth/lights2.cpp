#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;

int n,m;
int main(){
//void toggle(int,int, int **);
void display(int **);
std::cin>>n;
m=n+2;	
int **arr = (int **)calloc(m,sizeof(int*));

for(int i=0;i<m;i++){
	arr[i] = (int*)calloc(m,sizeof(bool));
}
for(int i=1;i<=n;i++){
	for(int j=1;j<=n;j++){
		arr[i][j]=1;
	}
}
//for(int i=0;i<n;i++){
//	for(int j=0;j<n;j++){
//		std::cin>>arr[i][j];
//	}
//}
display(arr);
}

void display(int **arr){

for(int i=0;i<m;i++){
	for(int j=0;j<m;j++){
		std::cout<<arr[i][j];
	}
	std::cout<<endl;
}
}
