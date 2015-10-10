#include<iostream>
int num,base;
int main()
{
  void input();
  input();
  int n=num,m;
  
  int quad[20]={0},i=0;
  
  while(n>=base)
  { 
     n=(num/base);
     m=(num%base);
     
     quad[i]=m;
     i++;
     
     num=n;
  }
  
  quad[i]=n;
  
  ///std::cout<<"\n"<<i<<"\n";
	 
	
	int temp,j,k;
    for(j=0,k=i;j<=(i/2),k>=(i/2);j++,k--)
    {
       temp=quad[j];
       quad[j]=quad[i];
       quad[i]=temp;
	}
	std::cout<<"\n";
	for(int j=0;j<=i;j++)
	{ std::cout<<quad[j]; }
	
return(0);
    
  }


void input()
{ std::cout<<"Enter number: ";
  std::cin>>num;
  
  std::cout<<"base: ";
  std::cin>>base;
}
