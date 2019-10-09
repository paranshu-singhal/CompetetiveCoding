#include<string.h>
#include<stdio.h>
#include<stdlib.h>
#include <algorithm>
using namespace std;
typedef long long LL;
struct node{
	int s;
	node *next;
	int c;
};
LL n;
LL ans[1000];
LL l;
LL count2=0;
int main(){
	int bfs(node*, node*);
	void push(node *, int);
	void display(node*);
	void init(node *ptr);
	void disp_ans();
	void disp2_ans();
	LL t;
	scanf("%LLd",&t);
	while(t--){
		n=0;
		scanf("%LLd",&n);
		node *ptr=(node*)calloc(n,sizeof(node));
		for(int i=0;i<n;i++){ (ptr+i)->s=(i+1); (ptr+i)->next=NULL;}
		
		for(int i=0;i<n;i++){
			//printf("%d",i);
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
	 bfs(ptr, ptr+k);
	  disp2_ans();
	  //display(ptr);
	  printf("  ");
    }
    
    //printf("%LLd", count2);
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

int bfs(node *ptr, node *n1){
bool check(node*);
while(check(ptr)){
if(n1->c!=1){
n1->c=1;
ans[l]=n1->s;
l++;
if(n1->next!=NULL){
	n1=n1->next;
	n1->c=1;
	bfs(ptr, ptr+(n1->s)-1);
}
else{
	return 0;
}
}
else{
	return 0;
}
}
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
l=0;
LL i=0;
while(ans[i]){
	ans[i]=0;
	i++;
}
}

void disp_ans(){
	
	LL i=0, count=0;	
	while(ans[i]){i++;}
	sort(ans, ans+i);
	int k;
	for(int j=0,k=j+1;k<=i;j++,k++){
		if(ans[j]!=ans[k]){
			count++;
		} }
	if(count==n){
		count2++;
	}
	
}

void disp2_ans(){
	LL i=0;
	while(ans[i]){
		printf("%d", ans[i]);
		i++;
	}
}
