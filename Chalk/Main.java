#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,totaldays;
  cin>>n;
  totaldays=n + sqrt(n);
  cout<<(totaldays+1);
}