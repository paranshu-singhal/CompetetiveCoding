#include<iostream>
using namespace std;

int main()
{
//int partition(int*,int,int);
void quicksort(int*,int,int);
int a[13]={2,8,7,1,3,5,6,4, 10, 15,12,20,27};
//int x = partition(a,0,7);
quicksort(a,0,12);
for(int i=0;i<13;i++)
{ std::cout<<a[i]<<endl; }
}

void quicksort(int *a,int p,int r)
{
int partition(int*,int,int);
if(p<r){
int x = partition(a,p,r);
quicksort(a,p,x-1);
quicksort(a,x+1,r);
}
}

int partition(int *a, int p, int r)
{   int temp;
	int x=a[r];
	int i=p-1;
	for(int j=p; j<r;j++)
	{
		if(a[j]<x)
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



