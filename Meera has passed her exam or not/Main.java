#include<iostream>
int main()
{
  int n,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  int num,temp=0;
  std::cin>>num;
  for(i=0;i<n;i++) {
    if(a[i]==num) {
      temp=1;
    }
  }
  if(temp==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}