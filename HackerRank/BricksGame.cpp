#include<iostream>
#include<algorithm>
#include<cstring>
#define len 100005
using namespace std;
typedef long long ll;
int main(){
	int t;
	std::cin>>t;
	while(t--){
		int N;
		std::cin>>N;
		ll score[len];
		ll sum[len];
		ll best[len];
		
		memset(score,0,sizeof(score));	
		memset(sum,0,sizeof(sum));	
		memset(best,0,sizeof(best));
		
		for (int i = 1; i <= N; i++){
		  std::cin >> score[i];
         }
        for (int i = N; i >= 1; i--){
         sum[i] = score[i] + sum[i + 1];
    }
		 best[N] = sum[N];
         best[N - 1] = sum[N - 1];
         best[N - 2] = sum[N - 2];
         for (int i = N - 3; i >= 1; i--){
         {
             for (int j = 1; j <= 3; j++)
                 best[i] = std::max(best[i], sum[i] - best[i + j]);
     }
 }
    std::cout << best[1] << endl;
	}
}
