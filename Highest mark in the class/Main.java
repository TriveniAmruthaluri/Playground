#include<iostream>
int main()
{
  // Type your code here
  int n,i;
  std::cin>>n;
  int a[n];
  for (i = 0; i < n; i++)
  	std::cin>>a[i];
  for(i = 1;i < n; ++i)
    {
       if(a[0] < a[i])
           a[0] = a[i];
    }
    std::cout <<a[0];
}