#include<iostream>
using namespace std;
struct node{
	int data;
	struct node *next;
};
node *start=NULL;
node *end=NULL;

int main()
{  
void insert();
void display();
int n;
	std::cout<<"Enter total sequence ";
	std::cin>>n;
	for(int i=0;i<n;i++)
	{ insert();}
	display();
	return 0;
}

void insert()
{  int m;   
std::cout<<"Enter data: ";
std::cin>>m;

     struct node *no = new node;
	 no->data=m;
	if(start==NULL){
	 no->next=NULL;
	 start=end=no;
	}
	else{
		end->next=no;
		end=no;
	}
}

void display(){
	while(start!=end)
	{ 
	std::cout<<start->data<<endl;
	start=start->next;
}
std::cout<<start->data<<endl;

}
