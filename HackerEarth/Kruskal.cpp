#include<iostream>
#include<cstdlib>
#include<algorithm>
#include<climits>
#define len 100
using namespace std;
typedef int ll;
struct node{
	int s;
	int d;
	int w;
}; 

int main(){
	
	void quicksort(node*,int,int);
	
	ll n,m;
	std::cin>>n;
	std::cin>>m;
	
    node *ptr=(node*)calloc(len, sizeof(node));
    bool arr[len];
    std::fill_n(arr,len,0);
	
	for(int i=0;i<m;i++){
		std::cin>>ptr[i].s;
		std::cin>>ptr[i].d;
		std::cin>>ptr[i].w;
	}
	
//	int waste;
//	std::cin>>waste;
	quicksort(ptr, 0, m-1);
	
	ll ans=0;
//	ll min=INT_MAX;
	for(int i=0;i<m;i++){
//	std::cout<<"s"<<ptr[i].s<<"d"<<ptr[i].d<<"w"<<ptr[i].w<<endl;
	if(arr[ptr[i].s]!=1 || arr[ptr[i].d]!=1)
	{
		arr[ptr[i].s]=1;
		arr[ptr[i].d]=1;
		ans+=ptr[i].w;	
		}
	}
}
	std::cout<<ans;
}
void quicksort(node *n,int p,int r)
{
int partition(node*,int,int);
if(p<r){
int x = partition(n,p,r);
quicksort(n,p,x-1);
quicksort(n,x+1,r);
}
}

int partition(node *a, int p, int r)
{   node temp;
	int x=a[r].w;
	int i=p-1;
	for(int j=p; j<r;j++)
	{
		if(a[j].w<x)
		{ i++;
		  temp =a[i];
		  a[i]=a[j];
		  a[j]=temp; 
		}
	}
	temp =a[i+1];
    a[i+1]=a[r];
	a[r]=temp;
	return i+1;
}



