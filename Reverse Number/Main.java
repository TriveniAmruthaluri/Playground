#include <iostream>
#include <bits/stdc++.h> 
using namespace std;
int reversDigits(int num)  
{
	// Type your code here
  	int rev_num = 0; 
	while(num > 0) 
	{ 
		rev_num = rev_num*10 + num%10; 
		num = num/10; 
	} 
	return rev_num; 
} 
int main() 
{ 
	int num;
    cin>>num;
	cout << reversDigits(num); 
	getchar(); 
	return 0;
}