#include<bits/stdc++.h>
#define len 1000

#define len2 3000
int tree[len2];
int main(){
	
	void build(int[],int,int,int);
	int query(int,int,int,int,int);
	void update(int,int,int,int,int);
	
	int arr[len];
	int n;
	std::cin>>n;
	for(int i=0;i<n;i++) std::cin>>arr[i];
	build(arr,1,0,n-1);
//	for(int i=0;i<10;i++) std::cout<<tree[i]<<"\n";
	int q;
	std::cin>>q;
	while(q--){
	int k,l,r;
	std::cin>>k;
	std::cin>>l;
	std::cin>>r;
	if(k==0) std::cout<<query(1,1,n,l,r)<<"\n";		
	else {
	update(1,1,n,l,r);
//	for(int i=0;i<10;i++) std::cout<<tree[i]<<"\n";
	}
	}
}

void build(int arr[],int n,int s,int e){
	if(s==e) tree[n]=arr[s];
	else{
	int mid=(s+e)/2;
	build(arr,2*n,s,mid);
	build(arr,2*n+1,mid+1,e);
	tree[n]=std::min(tree[2*n],tree[2*n+1]);	
	}
}
int query(int n,int s,int e,int l,int r){
	if(r<s or l>e) return INT_MAX;
	else if(l<=s and r>=e) return tree[n];
	int mid=(s+e)/2;
	return std::min(query(2*n,s,mid,l,r),query(2*n+1,mid+1,e,l,r));
}
void update(int n,int s,int e,int i,int val){
	if(i>e or i<s) return;
	if(s!=e){
	int mid=(s+e)/2;
	update(2*n,s,mid,i,val);
	update(2*n+1,mid+1,e,i,val);
	}
	else{
		tree[n]=val;
		return;
	}
	tree[n]=std::min(tree[2*n],tree[2*n+1]);
}

