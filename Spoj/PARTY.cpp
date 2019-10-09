#include<bits/stdc++.h>
void knapSack(int W, int wt[], int val[], int n)
{
   int i, w;
   int K[n+1][W+1];
for (i = 0; i <= n; i++)
   {
       for (w = 0; w <= W; w++)
       {
           if (i==0 || w==0)
               K[i][w] = 0;
           else if (wt[i-1] <= w)
                 K[i][w] = std::max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
           else
                 K[i][w] = K[i-1][w];
       }
   }
for(int i=W;i>0;i--){
	if(K[n][i]!=K[n][i-1]) {printf("%d %d \n",i,K[n][i]);break;}
}
}
int main()
{
    while(1){
	int cap,n;
	std::cin>>cap;
	std::cin>>n;
	
	if(cap!=0 && n!=0){
	int val[n+1],wt[n+1];
	for(int i=0;i<n;i++){
		scanf("%d",&wt[i]);
		scanf("%d",&val[i]);
	}

knapSack(cap, wt, val, n);
}
else break;
}
return 0;
}
