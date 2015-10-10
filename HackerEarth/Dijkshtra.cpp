#include<iostream>
#include<limits.h>
#include<string.h>
#include<stdlib.h>

#define white 0
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
	int display(node*);
	void dijkshtra(node*, node*);
	void init(node*);
	
	std::cin>>n;	
    
	node *ptr=(node*)calloc(n, sizeof(node));
	for(int i=0;i<n;i++){ (ptr+i)->s=(i+1); (ptr+i)->next=NULL;}
	
	int s,d,w;
	for(int i=0;i<n-1;i++)
	{
		std::cin>>s;std::cin>>d;std::cin>>w;
		
		allocmem(ptr,s,d,w);
		allocmem(ptr,d,s,w);
	}
  int f;
  std::cin>>f;
  
  int *cas = (int*)calloc(f, sizeof(int));
  int max1,max;
  
  for(int i=0;i<f;i++){
  	std::cin>>cas[i];
   }
  for(int i=0;i<f;i++){
  init(ptr);
  dijkshtra(ptr, ptr+cas[i]-1);
  if(i==0){
  	max = display(ptr);
  }
  else{
    max1 = display(ptr);
  	if(max1>max){
  		max=max1;
  	}
  }
  
}
std::cout<<"max"<<max;
}

void allocmem(node *ptr,int s,int d,int w){
	
	node *n1 = new node;
	n1->s=(d);n1->w=w;n1->next=NULL;
    node *n2 = (ptr+s-1);
    if(n2->next!=NULL){
    	while(n2->next!=NULL){
    	n2=n2->next;
	}
}
n2->next=n1;
}

int display(node *ptr){
int x=(ptr->w);
for(int i=0;i<n;i++)
{ 
node *n2=(ptr+i);
if(n2->w>x){ x=n2->w;
}
//std::cout<<n2->s<<","<<n2->w<<"   ";
//std::cout<<endl;
}
return x;
}

void init(node *ptr){
	for(int i=0;i<n;i++)
	{(ptr+i)->w=INT_MAX; (ptr+i)->color=0;
 	
	}
}

node *extract_min(node *ptr){
	node *x=ptr;
	if(x->color==black){
		while(x->color==black){
		 x=x+1;
		 }
	}
	for(int i=0;i<n;i++){
		if((ptr+i)!=x && (ptr+i)->color!=black)
		{
		   if((ptr+i)->w<(x->w)){
			x=(ptr+i);
		  }
       }
	}
	return x;
}
int relax(node *u, node *v, int x)
{
	if(v->w > (u->w + x))
	{ 
	  v->w = (u->w + x);
	}
	
}

void dijkshtra(node *ptr, node *s){
  
  node *extract_min(node *);
  bool check(node*);
  s->w=0;
  
 while(check(ptr)){
  
  node *x = extract_min(ptr);
  std::cout<<x->s<<endl;
  x->color=black;
  
  if(x->next!=NULL){
  
    node *n2=(x->next);
    do{
     node *v = (ptr+((n2->s)-1));
     relax(x,v,n2->w);
     n2=n2->next;	
    }
    while(n2!=NULL);
}
}
}

bool check(node *ptr){
	for(int i=0;i<n;i++)
	{
		if((ptr+i)->color!=black){
			return 1;
			break;
		}
	}
	return 0;
}



