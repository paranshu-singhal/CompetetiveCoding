#include<stdio.h>
#include<stdlib.h>
#include<math.h>
using namespace std;
typedef double fl;
inline fl calc_x(fl a,fl b,fl c,fl x,fl y){
	fl m=(b/a);
	fl num=(c/b)-(m*x)+y;
	//printf("num %f ",num);
	fl den=0-(m+(a/b));
	//printf("den %f ",den);
	return (num/den);
}
inline fl calc_y(fl x,fl a,fl b,fl c){
	return ((((0-a)/b)*x)-(c/b));
}
inline fl calc_dist(fl x1,fl y1,fl x2,fl y2){
	
	fl t1=pow((x2-x1),2);
	//printf("x %f ",t1);
	fl t2=pow((y2-y1),2);
	//printf("y %f \n",t2);
	return sqrt(t1+t2);
}
int main(){
	
	int t;
	scanf("%d",&t);
	while(t--){
		int n;
		scanf("%d",&n);
		fl a,b,c;
		scanf("%lf",&a);
		scanf("%lf",&b);
		scanf("%lf",&c);
		
		fl *xrr=(fl*)calloc(n,sizeof(fl));
		fl *yrr=(fl*)calloc(n,sizeof(fl));
		
		fl xcent=0,ycent=0;
		for(int i=0;i<n;i++){
			fl x1,x2;
		    scanf("%lf",&xrr[i]);
		    scanf("%lf",&yrr[i]);
		    fl xt;
			xt=calc_x(a,b,c,xrr[i],yrr[i]);
			xcent+=xt;
			//printf("%f ",xrr[i]);
			ycent+=calc_y(xt,a,b,c);
			//printf("%f \n",yrr[i]);
		}
		xcent/=n;
		ycent/=n;
		printf("%lf ",xcent);
		printf("%lf ",ycent);
		
		fl ans=0;
		for(int i=0;i<n;i++){
		 ans+=calc_dist(xcent,ycent,xrr[i],yrr[i]);
		 //printf("%f ",ans);
		 }
		 printf("%lf ",ans);
	}
}
