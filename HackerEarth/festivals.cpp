#include<iostream>
#include<limits.h>
#include<string.h>
#include<stdlib.h>
#include<algorithm>

#define white 0
#define grey 1
#define black 2
using namespace std;

struct node{
	int s;
	int w;
	int color;
	node *next;
	
}; 

int n;
int main(void)
{
	void allocmem(node*,int,int,int);
	int bfs(node*);
    std::cin>>n;	
    
	node *ptr=(node*)calloc(n, sizeof(node));
	for(int i=0;i<n;i++){ (ptr+i)->s=(i+1); (ptr+i)->next=NULL;}
	
	int s,d,w;
	for(int i=0;i<n-1;i++)
	{
		std::cin>>s;std::cin>>d;std::cin>>w;
		s=s-1;d=d-1;
		allocmem(ptr,s,d,w);
		allocmem(ptr,d,s,w);
	}
}

void allocmem(node *ptr,int s,int d,int w){
	
	node *n1 = new node;
	n1->s=(d);n1->w=w;n1->next=NULL;
    node *n2 = (ptr+s);
    if(n2->next!=NULL){
    	while(n2->next!=NULL){
    	n2=n2->next;
	}
}
n2->next=n1;
}

void init(node *ptr){
	for(int i=0;i<n;i++)
	{(ptr+i)->w=INT_MAX;
	}
}

int bfs(node *ptr){
	
 void init(node*);
 init(ptr);
 
 int f;
 std::cin>>f;
 int *ptr2 = (int*)calloc(f, sizeof(int));
 for(int i=0;i<f;i++){
   std::cin>>*(ptr2+f);
 }
}

int dijkstra(node *s, node *ptr)
{   int extract_min(node*, int);
    int relax(node*,node*,int);
	s->w=0;
	node *q = ptr;
	int count=n;
	while(q){
	 int u = extract_min(q, count);
	 
	 node *n2 = (ptr+u);
	 while(n2->next!=NULL)
	{ 
	  n2->color=grey;
	  relax(n2, n2->next, n2->next->w);
	  n2=n2->next;
	}
}
}

int relax(node *u, node *v, int x)
{
	if(v->w > (u->w + x))
	{ 
	  v->w = (u->w + x);
	}
	
}

int extract_min(node *ptr, int i){
	
	int x = ptr->w;
	int m=0;
	for(int j=1;j<i;j++)
	{ 
	 if(((ptr+j)->w)<x)
	 { x = (ptr+j)->w;
	    m = j;
	 } 
	}
return m;
}
