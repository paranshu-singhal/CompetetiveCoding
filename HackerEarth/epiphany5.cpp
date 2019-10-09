#include<iostream>
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
using namespace std;
struct node{
	bool color;
	int n;
	node *next;
};
int main(){
	void push(int,int,node*);
	void display(node*,int);
	
	int t;
	scanf("%d",&t);
	while(t--){
		
		int n,m;
		scanf("%d",&n);
		scanf("%d",&m);
		
		node *arr = (node*)calloc(n, sizeof(node));
		for(int i=0;i<n;i++){
			(arr+i)->next=NULL;(arr+i)->n=i+1;
		}
		
		for(int i=0;i<m;i++){
			int p,q;
			scanf("%d",&p);
			scanf("%d",&q);
			push(q-1,p, arr);
		}
		
	    for(int i=0;i<n;i++){
	    	if((arr+i)->next==NULL){
	    		(arr+i)->color=1;
	    	}
	    }
	    
	    int cnt=0;
	    
		for(int i=0;i<n;i++){
	    	if((arr+i)->color!=1){
	    		node *n2=arr+i;
				while(n2!=NULL){
	    			n2=n2->next;
					if(arr+n2->n-1->color)
	    		}
	    	}
	    }
	
	
	}
	
	
}

void push(int n,int k, node *arr){
	node *n1 = new node;
	n1->n=k;n1->color=0;n1->next=NULL;
	node *n2=arr+n;
	while(n2->next!=NULL){
		n2=n2->next;
	}
	n2->next=n1;
	
}

void display(node *arr, int n){
	for(int i=0;i<n;i++){
	    	node *n2=arr+i;
	    	
			while(n2->next!=NULL){
				printf("%d ",n2->n);
				n2=n2->next;
			}
		printf("%d ",n2->n);	
	    std::cout<<endl;
		}
}
