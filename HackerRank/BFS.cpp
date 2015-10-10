#include<iostream>
#include<algorithm>
#include<cstring>
#include<climits>
int ptr[1002][1002];
int st[1002];
int color[1002];
int dist[1002];
int n;

int main(){
	int bfs(int);
	
	int t;
	std::cin>>t;
   	while(t--){
	   	
	for(int i=0;i<1002;i++){
       std::fill_n(ptr[i],1002, -1);
	}
	
	memset(st,0,sizeof(st));
	memset(color,0,sizeof(color));
	
	std::fill_n(dist,1002,10000);

    

		int m;
		std::cin>>n;
		std::cin>>m;
		
		for(int i=0;i<m;i++){
			int a,b;
			std::cin>>a;
			std::cin>>b;
			ptr[a-1][st[a-1]++]=b-1;
			ptr[b-1][st[b-1]++]=a-1;
       }
		
		int start;
		std::cin>>start;
		start--;
		dist[start]=0;
		bfs(start);
		for(int i=0;i<n;i++){
			if(i!=start && dist[i]<2000){
				std::cout<<dist[i]*6<<" ";
			}
			else if(i!=start && dist[i]>2000){
				std::cout<<"-1"<<" ";
				
			}
			
		}
	  std::cout<<"\n"; 	
	 
	}
	return 0;
}

void display(){
	for(int i=0;i<n;i++){
			for(int j=0;j<=st[i];j++){
			    std::cout<<ptr[i][j]<<" ";
			}
		std::cout<<"\n";
		}
}

int ex_min(){
	int i, min=-1;
	for(i=0;i<n;i++){
		if(color[i]!=1){
			min=i;
		}
	}
	if(i+1<n){
	for(int j=i+1;j<n;j++){
		if(dist[i]<dist[min] && color[i]!=1){
			min=i;
		}
	}
  }
//	std::cout<<"min"<<min<<"\n";
	return min;
}


void bfs(int start){
//	std::cout<<"st"<<start<<"\n";
	
	void relax(int, int);
	int ex_min();
	
	color[start]=1;
	for(int i=0;ptr[start][i]!=-1;i++){
	//	color[ptr[start][i]]=1;
		relax(start,ptr[start][i]);
	}
	
	int h = ex_min();
	if(h!=-1){
	bfs(h);	
	}
	
}

void relax(int s, int d){
//	std::cout<<"s"<<s<<"d"<<d<<"\n";
	dist[d] = std::min(dist[d], dist[s]+1);
}
