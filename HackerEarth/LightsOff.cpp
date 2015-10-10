#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;

int n;

int main(){
void toggle(int,int, int **);
void display(int **);
std::cin>>n;
	
int **arr = (int **)malloc(n * sizeof(int *));

for(int i=0;i<n;i++){
	arr[i] = (int*)malloc(n*sizeof(bool));
}
for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		arr[i][j]=0;
	}
}
for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		std::cin>>arr[i][j];
	}
}

toggle(1,1,arr);
display(arr);
}

void toggle(int i,int j, int **arr){
  	bool toggle_2(bool);
	i--;j--;
  	arr[i][j] = toggle_2(arr[i][j]);
	if(i>=1 && j>=1 && i<n-1 && j<n-1){
  	   arr[i+1][j] = toggle_2(arr[i+1][j]);
  		arr[i-1][j] = toggle_2(arr[i-1][j]);
  		arr[i][j+1] = toggle_2(arr[i][j+1]);
  		arr[i][j-1] = toggle_2(arr[i][j-1]);
    }
    else if(i==0  && j<n-1 && j>0){
    	arr[i][j+1] = toggle_2(arr[i][j+1]);
  		arr[i][j-1] = toggle_2(arr[i][j-1]);
  		arr[i+1][j] = toggle_2(arr[i+1][j]);
    }
    else if(i>0 && i<n-1 && j==0){
    	arr[i+1][j] = toggle_2(arr[i+1][j]);
  		arr[i-1][j] = toggle_2(arr[i-1][j]);
  		arr[i][j+1] = toggle_2(arr[i][j-1]);
    }
    else if(i>0 && i<n-1 && j==n-1){
    	arr[i+1][j] = toggle_2(arr[i+1][j]);
  		arr[i-1][j] = toggle_2(arr[i-1][j]);
  		arr[i][j-1] = toggle_2(arr[i][j-1]);
    }
    else if(i==n-1  && j<n-1 && j>0){
    	arr[i-1][j] = toggle_2(arr[i-1][j]);
  		arr[i][j+1] = toggle_2(arr[i][j+1]);
  		arr[i][j-1] = toggle_2(arr[i][j-1]);
    }
	else if 
  	
}

bool toggle_2(bool i){
	if(i==1){
		return 0;
	}
	else{
		return 1;
	}
}
void display(int **arr){

for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		std::cout<<arr[i][j];
	}
	std::cout<<endl;
}
}
