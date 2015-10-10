#include<iostream>
#define left(i) ((2*i)+1)
#define right(i) ((2*i)+2)
 
using namespace std;
static int heap_size=8;
int main()
{
	
	void build_heapify(int*);
	void heapify(int*,int);
	int a[8]={2,8,7,1,3,5,6,4};
	
	int temp;
	build_heapify(a);
	for(int i=10 ;i>-1; i--)
	{ temp=a[0];
	  a[0]=a[i];
	  a[i]=temp;
	  heap_size = heap_size-1;
	  heapify(a,0);
	}
	
	for(int i=0;i<10;i++)
	{ std::cout<<a[i]<<";";
	}
	
}

void build_heapify(int *a)
{   void heapify(int*,int);
	for(int i=(heap_size/2);i>-1;i--){
	heapify(a,i);}
}

void heapify(int *a, int i)
{
	int l = left(i);
	int r = right(i);
	
	//std::cout<<"l: "<<l<<"  ";
	//std::cout<<"r: "<<r<<"  ";
	int largest=i, temp;
	
	if(l<heap_size && a[l]>a[i])
	{  largest=l;}
	else{ largest=i;
	}
	if(r<heap_size && a[r]>a[largest])
	{ largest=r;}
	
	if(largest!=i)
	{
		temp=a[largest];
		a[largest]=a[i];
		a[i]=temp;
	   heapify(a, largest);       
	}
		
}





