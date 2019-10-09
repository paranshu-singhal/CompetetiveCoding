#include<string.h>
#include<stdio.h>
#include<stdlib.h>
using namespace std;
typedef long long LL;
struct node{
	int s;
	node *next;
	int c;
};
LL n;
LL count1=0,count2=0;
int main(){
	int dfs(node*, node*);
	void push(node *, int);
	void display(node*);
	void init(node *ptr);
	
	LL t;
	scanf("%LLd",&t);
	while(t--){
		n=0;
		scanf("%LLd",&n);
		node *ptr=(node*)calloc(n,sizeof(node));
		for(int i=0;i<n;i++){ (ptr+i)->s=(i+1); (ptr+i)->next=NULL;}
		
		for(int i=0;i<n;i++){
			LL m;
			scanf("%LLd",&m);
			for(int j=0;j<m;j++){
				int inp;
				scanf("%d", &inp);
				push(ptr+inp-1, i+1);
			}
		}
	 //display(ptr);
     for(int k=0;k<n;k++){
	 init(ptr);
	 dfs(ptr, ptr+k);
	 }
    printf("%LLd", count2);
    count2=0;
}
}

void push(node *ptr,int d){
	node *n2=ptr;
	node *n1=new node;
	n1->s=d;n1->next=NULL;n1->c=0;
	while(n2->next!=NULL){
		n2=n2->next;
	}
	n2->next=n1;
}

int dfs(node *ptr, node *n1){
bool check(node*);

//	while(check(ptr)){
	n1->c=1;
    count1++;
    if(count1==n){
    	count2++;
    }
	//printf("%d%d  ",n1->s,count1);
    while(1){
    if (n1->next!=NULL){
    if (((ptr+(n1->next)->s)-1)->c==1){
	 n1=n1->next;
	}
	else{
		n1=n1->next;
		dfs(ptr, ptr+(n1->s)-1);
		
	}
   }
    else{
	    return 0;
    }
   }
//}
}
void display(node *ptr){
	for(int i=0;i<n;i++){
		node *n1=ptr+i;
		while(n1!=NULL){
			printf("s %d", n1->s);
			printf("c %d", n1->c);
			n1=n1->next;
		}
	  printf("  ");
	}
}

bool check(node *ptr){
	for(int i=0;i<n;i++)
	{
		if((ptr+i)->c==0){
			return 1;
			break;
		}
	}
	return 0;
}

void init(node*ptr){
  for(int i=0;i<n;i++)
	{	(ptr+i)->c=0;
}
count1=0;
}


