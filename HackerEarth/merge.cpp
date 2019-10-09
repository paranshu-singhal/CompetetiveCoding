#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	void insertionsort(int*);
	int a[10]={5,8,2,1,9,10,1,2};
	insertionsort(a);
}

void insertionsort(int *a)
{
	for (int i=1;i<10;i++)
	{
		int key = a[i];
		int j=i-1;
		while(j>-1 && a[j]>key)
		{ a[j+1]=a[j];
		  j--;
		}
		a[j+1]=key;
	}
  for(int i=0;i<10;i++)
  { std::cout<<a[i];
  }
}
