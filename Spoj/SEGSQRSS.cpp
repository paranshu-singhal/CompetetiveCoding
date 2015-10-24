#include<bits/stdc++.h>
#define len 1000005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i
using namespace std;
typedef long long ll;
ll tree[len];
ll arr[len/10];

int main(){
	void build(ll,ll,ll);
	ll query(ll,ll,ll,ll,ll);
	void updatef(ll,ll,ll,ll,ll,ll);
	void updatel(ll,ll,ll,ll,ll,ll);
int t;
scanf("%d",&t);
For(i,1,t+1){
	printf("Case %d:\n",i);
	fill_n(tree,len,0);
	
	ll n,q;
	scanf("%lld",&n);
	scanf("%lld",&q);
	For(i,0,n) scanf("%lld",&arr[i]), arr[i]=sq(arr[i]);
	build(1,0,n-1);
//	For(i,0,2*n) cout<<tree[i]<<"\n";
	while(q--){
		ll l,r,s,x;
		scanf("%lld",&s);
		scanf("%lld",&l);
		scanf("%lld",&r);
		if(s==2){
			printf("%lld\n",query(1,l,r,1,n));
		}
		else if(s==0){
		 scanf("%lld",&x);
		 updatef(1,l,r,1,n,sq(x));	
//		 For(i,0,2*n) cout<<tree[i]<<"\n";
		}
		else if(s==1){
		scanf("%lld",&x);
		updatel(1,l,r,1,n,x);	
//		 For(i,0,2*n) cout<<tree[i]<<"\n";
		}
	}
}
}
void build(ll n,ll l,ll r){
	if(l==r) tree[n]=arr[l];
	else {
		ll mid=(l+r)/2;
		build(2*n,l,mid);
		build(2*n+1,mid+1,r);
		tree[n]=(tree[2*n])+(tree[2*n+1]);
	}
}

ll query(ll n,ll l,ll r,ll s,ll e){
//	cout<<s<<" "<<e<<"\n";
	if(l>e or r<s) return 0;
	else if(l<=s and e<=r) return tree[n];
	
	ll mid=(s+e)/2;
	ll l1=query(2*n,l,r,s,mid);
	ll l2=query(2*n+1,l,r,mid+1,e);
	return (l1+l2);
}

void updatef(ll n,ll l,ll r,ll s,ll e, ll val){
 //cout<<s<<" "<<e<<"\n";
 if(l>e or r<s){
 return;}
 else if(s==e){
 tree[n]=val;return;}
 else{
 ll mid=(s+e)/2;
 updatef(2*n,l,r,s,mid,val);
 updatef(2*n+1,l,r,mid+1,e,val);
 tree[n]=tree[2*n]+tree[2*n+1];
}
}

void updatel(ll n,ll l,ll r,ll s,ll e, ll val){
//cout<<s<<" "<<e<<"\n";
//cout<<"update1";
 if(l>e or r<s){
 return;}
 
 else if(s==e){
// cout<<"s==e";	
 ll temp=sqrt(tree[n])+val;
// cout<<"temp"<<temp;
 tree[n]=sq(temp);
 return;
 }
 else{
 ll mid=(s+e)/2;
 updatel(2*n,l,r,s,mid,val);
 updatel(2*n+1,l,r,mid+1,e,val);
 tree[n]=tree[2*n]+tree[2*n+1];
}
}

