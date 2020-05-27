#include<iostream>
int main(){
  // Type your code here
  int i,n,fact=1;
  std::cin>>n;
  for(i=1;i<=n;i++){fact=fact*i;}
  std::cout<<fact;
}