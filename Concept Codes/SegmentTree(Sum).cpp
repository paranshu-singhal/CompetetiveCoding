#include<bits/stdc++.h>
#define len 1000
#define len2 2050
int tree[len2],start=1,end;
int main(){
	void construct(int[],int,int,int);
	int query(int,int,int,int,int);
	void update(int,int,int,int,int);
	int arr[len];
	int n;
	std::cin>>n;
	for(int i=0;i<n;i++) std::cin>>arr[i];
	std::fill_n(tree,len2,0);
	
//	int h=(int)ceil(log2(n));
//	end = ((int)pow(2,h+1))-1;
//	std::cout<<"end"<<end<<"\n";
	construct(arr,1,0,n-1);
	for(int i=0;i<10;i++){ std::cout<<tree[i]<<" "; }
	std::cout<<"\n";
	
	int q;
	std::cin>>q;
	while(q--){
		int k,l,r;
		std::cin>>k;
		std::cin>>l;
		std::cin>>r;
		if(k==0)	std::cout<<query(1,start,n,l,r)<<"\n";	
		else{
		r-=arr[l-1];
		arr[l-1]=r;
		update(1,1,n,l,r);
		for(int i=0;i<10;i++){ std::cout<<tree[i]<<" "; }	
		}
	}
}
void construct(int arr[],int n,int l,int r){
	if(l==r) tree[n]=arr[l];
	else{
		int mid=(l+r)/2;
		construct(arr,2*n,l,mid);
		construct(arr,2*n+1,mid+1,r);
		tree[n]=tree[2*n]+tree[2*n+1];	
	}
}
int query(int n,int s,int e,int l,int r){
	if(l>e or r<s) return 0;
	else if(l<=s and r>=e) return tree[n];
	int mid=(s+e)/2;
	return (query(2*n,s,mid,l,r)+query(2*n+1,mid+1,e,l,r));
}
void update(int n,int s,int e,int i,int val){
	if(i<s or i>e) return;
	tree[n]+=val;
	if(s!=e){
		int mid=(s+e)/2;
		update(2*n,s,mid,i,val);
		update(2*n+1,mid+1,e,i,val);
	}
}

