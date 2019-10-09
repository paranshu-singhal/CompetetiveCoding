#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{ int power(int, unsigned int);
	int y1 = 63;
    int n=0;
int y2=y1-1;
std::cout<<y2<<endl;
for(int i=0;i<=4;i++)
 {
   y2=(y2-(int)power(2, i));
   std::cout<<y2<<endl;
   n++;
 }   
}

int power(int x, unsigned int y)
{
    if( y == 0)
        return 1;
    else if (y%2 == 0)
        return power(x, y/2)*power(x, y/2);
    else
        return x*power(x, y/2)*power(x, y/2);
 
}
