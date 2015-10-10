#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

using namespace std;
int main()
{
	
	char str[100];
	char *str1;
	char **str2;
	
	std::cout<<"Enter string ";
	gets(str);
	
	puts(str);

	std::cout<<&str;
	return 0;
	
}

