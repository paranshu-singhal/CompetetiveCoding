
#include<cstdio>
#include<string.h>
using namespace std;
struct stack{
	int n;
	stack *next;
	stack *prev;
}; stack *top=NULL,*end=NULL;
int main(){

void input(int);
void del(struct stack*);
int n;
scanf("%d",&n);
input(n);
stack *s2=top;
long long step;
scanf("%d", &step);
int count=0;
while(n>1){
for(int i=0;i<step;i++){
	s2=s2->next; }
//printf("%d", s2->prev->n);	
del(s2->prev);
n--;
count++;
}
count--;
printf("%d", count);


}
void input(int n){
	for(int i=0;i<n;i++){
	
	  stack *s1=new stack;
	  s1->n=(i+1);s1->next=NULL;s1->prev=NULL;
 	  if(top==NULL){
 	  	top=end=s1;
 	  }
 	  else{
 	  	end->next=s1;
 	  	s1->prev=end;
 	  	end=s1;
 	  	end->next=top;
 	  	top->prev=end;
 	  }
}
}

void del(struct stack *s2){
	if(s2==top){
		top=top->next;
	}
	else if(s2==end){
		end=end->prev;
	}
	stack *temp1=s2->prev;
	stack *temp2=s2->next;
	temp1->next=temp2;
	temp2->prev=temp1;
	delete(s2);
}


