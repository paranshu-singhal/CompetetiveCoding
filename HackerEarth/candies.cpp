#include<iostream>
#include<math.h>
using namespace std;
int a[20];
int main()
{ int m,n,k;
  
  int bubble_sort(int);
  std::cout<<"Enter N: ";
  std::cin>>n;
  
  std::cout<<"Enter M: ";
  std::cin>>m;
  
  std::cout<<"Enter K: ";
  std::cin>>k;
  
  std::cout<<"Enter A: ";
  for(int i=0;i<n;i++)
  { std::cin>>a[i]; }
  
  bubble_sort(n);
  
  for(int i=0;i<n;i++)
  { std::cout<<a[i]; }
  
  
  
  for(int j=0;j<n-m+1;j++) 
  { int sum=0;
   for(int i=j;i<m+j;i++)
    { sum=sum+a[i]; }
     std::cout<<"\n"<<sum;
   if((sum%k)==0)
    { std::cout<<"\n"<<"\n"<<sum; 
	  exit(0);
	} 
  }
  
  std::cout<<"\n"<<"\n"<<"-1";
  system("pause");
  return 0;
  
}

int bubble_sort(int n)
{ int temp=0;
  for(int k=0;k<n-1;k++)
  {
  for(int i=0;i<n-k-1;i++)
  { if(a[i]>a[i+1])
    {
      temp=a[i];
      a[i]=a[i+1];
      a[i+1]=temp;
	}
  }
}


}
