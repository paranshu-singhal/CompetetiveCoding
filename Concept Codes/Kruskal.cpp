#include<bits/stdc++.h>
#define len 100005
#define lenn 3005
#define Mod 1000000007
#define For(i,a,b) for(ll i=a;i<b;i++)
#define Forr(i,a,b) for(ll i=a;i>=b;i--)
#define sq(i) i*i

//#define src 0
///#define des 1
using namespace std;
typedef long long ll;
//int s[len][lenn][2];
//int ptr[len];
struct edge{
	int src,des,wt;
};

edge *ed=(edge*)calloc(lenn,sizeof(edge));
int find(int);
void uni(int,int);
ll ans=0;
int mycmp(const void*,const void*);
int parent[lenn];

int main(){
//memset(ptr,0,sizeof(ptr));
memset(parent,-1,sizeof(parent));
//For(i,1,7) cout<<ptr[i];
int n,m;
cin>>n>>m;
For(i,0,m){
cin>>ed[i].src;
cin>>ed[i].des;
cin>>ed[i].wt;
}
qsort(ed,m,sizeof(ed[0]),mycmp);
For(i,0,m){
//cout<<ed[i].src<<" ";
//cout<<ed[i].des<<" ";
//cout<<ed[i].wt<<"\n";
int x=find(ed[i].src);
int y=find(ed[i].des);
//cout<<"x"<<x<<"y"<<y<<"\n";
if(x==y){
	continue;
}
else{
	ans+=ed[i].wt;
	uni(x,y);	
}
}
cout<<ans;
}

int mycmp(const void*a,const void*b){
	struct edge *a1=(struct edge*)a;
	struct edge *a2=(struct edge*)b;
	return a1->wt>a2->wt;
}
int find(int i){
	if(parent[i]!=-1){
		find(parent[i]);
	}
	else return i;
}

void uni(int x,int y){
	
	
	int a=find(x);
	int b=find(y);
	parent[a]=b;
}
