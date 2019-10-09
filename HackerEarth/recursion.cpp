#include<cstdio>
int main(){
	
	int recurse(int);
	int a=0;
	a = recurse(a);
	printf("returned %d",a);
}

int recurse(int c){

for(int i=0;i<2;i++){
if(c<10){
 printf("%d", c);	
	recurse(c+1);
}
}
}

