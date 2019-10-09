
#include<stdlib.h>
#include <cstdio>
#include<string.h>
#define start 1
#define end m-1
typedef long long LL;

LL t,m,l,r;
int count1=0,count2=0;
//int max=0, count=0;
struct stack{
	int n;
	stack *next;
}; struct stack *top=NULL;
int main(){
    void init(int **);
	void find2(int**,int,int,int);
	void sort();
scanf(" %d",&t);
while(t--)
{

scanf("\n%d",&l),scanf("%d",&r);
	m=r-l+3;
	int **ptr=(int**)calloc(m,sizeof(int*));
	for(int i=0;i<m;i++){
		ptr[i]=(int*)calloc(m,sizeof(int));
	}

init(ptr);
struct stack *top=NULL;
count1=0;count2=0;    
for(int i=1;i<end;i++){
  find2(ptr,0,i,i);
}
sort();
//if(count2) printf("%d", count2);
//else printf("%d", count1);
delete(top);
delete(ptr);
}
}
void init(int **ptr){
	for(int i=start;i<end;i++){
		for(int j=start;j<end;j++){
           ptr[i][j]=((i-1)+l)^((j-1)+l);
}
}
stack *s1=top;
while(s1!=NULL){
	s1->n=0;
	s1=s1->next;
}
}
int dis[4][2]={{-1,0},{1,0},{0,-1},{0,1}};
void find2(int **ptr, int c,int i,int j){
void push(int);
if(c==0) count1++;
if(c==1) count2++;
push(c);
for(int e=0;e<4;e++){
	if((ptr[i+dis[e][0]][j+dis[e][1]])==(c+1)){
			find2(ptr,(c+1),(i+dis[e][0]), (j+dis[e][1])); }
}
}
void push(int n){
	stack *s1 = new stack;
	s1->n=n; s1->next=NULL;
	if(top==NULL){
		top=s1;
	}
	else{
		s1->next=top;
		top=s1;
	}
}	

void sort(){
 stack *s1=top;
 int max=s1->n;
 while(s1->next!=NULL){
 	if(s1->n>max) max=s1->n;
 	s1=s1->next;
 }
printf("%d ",max);
}
