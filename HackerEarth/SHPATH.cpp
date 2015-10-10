#include<iostream>
#include<limits.h>
#include<string.h>
#include<stdlib.h>
#include<stdio.h>

#define white 0
#define black 2
using namespace std;
//typedef char[11] name
typedef long long LL;
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
	
	scanf("%d",&n);	
    
	char names[10000][11];
	
	node *ptr=(node*)calloc(n, sizeof(node));
	//name *names=(name*)calloc(n, sizeof(name));
	for(int i=0;i<n;i++){ (ptr+i)->s=(i+1); (ptr+i)->next=NULL;}
	
	for(int i=0;i<n;i++){
		
		scanf("%s",&names[i]);
		
		int j,s,d,w;
		scanf("%d",&j); 
		while(j--){
			scanf("%d",&d);
			scanf("%d",&w);
			allocmem(ptr,i,d,w);
		    //allocmem(ptr,d,s);
		}
	}
	int t;
	scanf("%d",&t);
	while(t--){
		init(ptr);
		char sn[11];
	    scanf("%s",&sn);
	    int s=0,d=0;
		for(int i=0;i<n;i++){
			if(strcmp(sn, names[i])==0){
				s=i;
			}
		}
		scanf("%s",&sn);
		for(int i=0;i<n;i++){
			if(strcmp(sn, names[i])==0){
				d=i;
			}
		}
	  printf("%d %d",s,d);
	  //dijkshtra(ptr+s-1,ptr+d-1);
	  
	}
}

void allocmem(node *ptr,int s,int d, int w){
	
	node *n1 = new node;
	n1->s=(d); n1->next=NULL; n1->w=w;
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



