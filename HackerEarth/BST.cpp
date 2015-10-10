#include<iostream>
#include<string.h>
using namespace std;

struct node{
	int key;
	node *left;
	node *right;
}; node *root=NULL;

void insert(int k)
{
	node *node1 = new node;
	node1->key=k;
	node1->left=NULL;
	node1->right=NULL;
	if(root==NULL)
	{ root=node1;
	}
	else
	{  node *node2=NULL;
	   node *tree=root;
		while(tree!=NULL){
		node2=tree; 
		if(k<tree->key)
		{ tree=tree->left;
		}
		else
		{ tree=tree->right;
		}
	}
		if(k<node2->key)
		{  node2->left=node1;
		}
		else{
			node2->right=node1;
			
		}
	  }
//delete node2;
//delete tree;
}

int main(void)
{   void insert(int);
    void max();
    void min();
    int search(int k);
    
    int k=0;
    while(k!=1)
    {
    
	std::cout<<"Enter key: ";
	std::cin>>k;
	if(k!=1){
	insert(k); }
 }
 max();
 min();
 int m;
 std::cout<<"what to find: ";
 std::cin>>m;
 search(m);
}

void min()
{
	node *tree=root;
	while(tree->left!=NULL)
	 { tree=tree->left;
	 }
	 std::cout<<"min: "<<tree->key<<";";
}

void max()
{
	node *tree=root;
	while(tree->right!=NULL)
	 { tree=tree->right;
	 }
	 std::cout<<"max: "<<tree->key<<";";
}

int search(int k){
bool found=0;
node *tree=root;
while(1)
 {
 if(k<tree->key)
 { tree=tree->left;
   std::cout<<"left";
 }
 else if(k>tree->key)
 { tree=tree->right;
   std::cout<<"right";
 }
 else
 { std::cout<<"found";
   found=1;
   break;
}
}
if(found!=1){
std::cout<<"not found";
}
}

void delete(int k){
	
	
}
