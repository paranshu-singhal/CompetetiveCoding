#include<iostream>
#include<stdio.h>
#include<math.h>
typedef unsigned long long ll;
using namespace std;
int main(){
	ll arr[100];
	
	int a,b;
	scanf("%d",&arr[0]);
	scanf("%d",&arr[1]);
	
	int n;
	scanf("%d",&n);
	for(int i=2;i<n;i++){
		arr[i] = pow(arr[i-1],2) + arr[i-2];
	}
	std::cout<<arr[n-1];
	
}
