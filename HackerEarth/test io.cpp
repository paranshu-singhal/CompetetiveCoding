#include<iostream>

using namespace std;
int count=0;
int main()
 { int lcm(int ,int);
  int n,k=3,ans=0;
  std::cout<<"Enter no: ";
  std::cin>>n;
  while(k<n)
  {  int flag=lcm(n,k); 
     if(flag==-1)
     {ans++;
     }
	 k++;
  }
   std::cout<<"count "<<count;
   std::cout<<"ans "<<ans;
}
  
int lcm(int a, int k)
{   
	int n;
	n=(a%k);
	a=(a/k);
	
	
	if(n!=2)
	{ return 0; }
	else
	{ if(count<3)
	  {
	  std::cout<<n<<"\n"; 
	   lcm(a,k);
      }
      else
      {
         return -1;
	  }
	   count++; 
	}
	
}
