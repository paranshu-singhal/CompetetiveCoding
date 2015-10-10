#include<iostream>
#include<cstring>
typedef long int li;
li sum=0;
li ptr[1000];
int main(){
	li rec(int);
	
	int t;
	std::cin>>t;
	while(t--){
		li n;
		std::cin>>n;
		memset(ptr,0,sizeof(ptr));
		sum=0;
		for(li i=0;i<n;i++){
			std::cin>>ptr[i];
		}
		li k=n-1;
		while(k>0)
		{
	    	k=rec(k);
	    } 
	    std::cout<<sum<<"\n";
	}
}

li rec(int k){
	
	li lmax=ptr[k];
	li l=k-1;
	while(lmax>ptr[l] && l>-1){
		sum-=ptr[l];
		l--;
	}
	sum+=lmax*(k-l-1);
	return l;
}
