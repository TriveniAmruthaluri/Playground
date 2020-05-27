#include<iostream>
int main()
{
  int x;
  std::cin>>x;
  (x >= 0) ? std::cout<< x <<" is a positive number." : std::cout<< x <<" is a negative number.";
}