#include<bits/stdc++.h>
#define For(i,a,b) for(int i=a;i<b;i++)
using namespace std;
int main(){
	
	int n;
	string s1,s2;
	cin>>n>>s2>>s1;
	
	if(s1=="month"){
		if(n<30) cout<<"12";
		else if(n==30) cout<<"11";
		else cout<<"7";
	}
	else{
		if(n==5 || n==6) cout<<"53";
		else cout<<"52";
	}
	
}
