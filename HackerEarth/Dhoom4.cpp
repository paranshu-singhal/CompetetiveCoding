#include<stdio.h>
#include<string.h>
#include<stdlib.h>
typedef long long LL;
struct node{
	LL a;
	node *left;
	node *right;
}; node *root=NULL;
int main(){
	void push(LL);
	LL Skey,Lval=0;
	scanf("%LLd, %LLd", &Skey,&Lval);
	if (Skey%Lval!=0) {printf("-1");exit(0); }
	push(Skey);
	int n;
	scanf("%d", &n);
	LL val;
	for(int i=0;i<n;i++){
    scanf("%LLd",&val);
    push(val);
}
}

void push(LL n){
node *top=root;
node *node1=new node;
node1->a=n;
node1->left=NULL;
node1->right=NULL;

if(root==NULL){
 root=node1;
}
else{
	while(1){
		if (n<top->a){
		if(top->left!=NULL){
		top=top->left;
	   }
	   else{
	   	top->left=node1;
	   	break;
	   }
	}
		else{
			if(top->right!=NULL){
		    top=top->right;
	       }
	      else{
	      	top->right=node1;
	   	    break;
	     }
			
		}
	}
	
}
}
