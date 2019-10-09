#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
struct node{
	int s;
	int w;
	node *next;
	node *down;
} ;
int main(void)
{
	int n;
	std::cin>>n;
	
	node *ptr=(node*)calloc(n, sizeof(node));
	
	for(int i=0;i<n;i++)
	{ std::cout<<(ptr+i)->w;
	}
   
}
