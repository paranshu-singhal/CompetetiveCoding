#include<iostream>
#include<stdlib.h>
#include<string.h>

#define white 0
#define black 2
using namespace std;

struct node{
	int s;
	int color;
	node *next;
	
}; 
struct stack{
	int s;
	stack *next;
};
struct stack *top=NULL;
int n;
int main(void)
{
	void allocmem(node*,int,int,int);
	int display(node*);
	//void traverseDFS(node*);
	void trav_visit(node*, node*);
	
	std::cin>>n;	
    
	node *ptr=(node*)calloc(n, sizeof(node));
	for(int i=0;i<n;i++){ (ptr+i)->s=(i+1); (ptr+i)->next=NULL; }
	
	int s,d,w;
	for(int i=0;i<n-1;i++)
	{
		std::cin>>s;std::cin>>d;//std::cin>>w;
		allocmem(ptr,s,d,w);
	//	allocmem(ptr,d,s,w);
	}
  std::cout<<endl;
  
  //display(ptr);
  trav_visit(ptr, ptr);
}

void allocmem(node *ptr,int s,int d,int w){
	
	node *n1 = new node;
	n1->s=(d);n1->next=NULL;
    node *n2 = (ptr+s-1);
    if(n2->next!=NULL){
    	while(n2->next!=NULL){
    	n2=n2->next;
	}
}
n2->next=n1;
}
/////////////////////
bool check(node *ptr){
	bool k=1;
	for(int i=0;i<n;i++){
		if((ptr+i)->color!=black)
		{
		  	k=0;
		}
	}
   return k;
}
//////////////////////
void trav_visit(node *n1, node *ptr)
{
void push(int);	
bool check(node*);
void case2(node*);
std::cout<<n1->s;
n1->color=black;
if(check(ptr)){
	exit(0);
}
if(n1->next!=NULL){
push(n1->s);
while(n1->color==black){
n1=n1->next;
}
trav_visit((ptr+(n1->s))-1, ptr);
}
else{
case2(ptr); 
}
}

void case2(node *ptr){
void pop();
void trav_visit(node*, node*);

node *n2 = ptr+(top->s)-1;
 while((ptr+(n2->s)-1)->color==black){
	n2=n2->next;
   if(n2==NULL){
   	pop();
   	case2(ptr);
   }
}
trav_visit((ptr+(n2->s))-1, ptr);
}
 	

void display(node *ptr){
	
	for(int i=0;i<n;i++){
		node *n1 = ptr+i;
		while(n1!=NULL){
			std::cout<<n1->s;
			n1=n1->next;
		}
		std::cout<<endl;
	}
}

void push(int s){
	
	stack *s1 = new stack;
	s1->s=s;
	s1->next=NULL;
	if(top==NULL){
		top=s1;
	}
	else{
		s1->next=top;
		top=s1;
	}
}

void pop(){
if(top->next!=NULL){
stack *s1 = top->next;
delete top;
top=s1;
}
}

