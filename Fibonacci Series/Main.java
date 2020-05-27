#include<bits/stdc++.h> 
using namespace std; 
  
int fib(int n) 
{ 
    if (n == 1)
    {
      return 0;
    }
  else if (n == 2)
    {
      return 1;
    }
  else
    {
      return (fib (n - 1) + fib (n - 2));
    }
} 
  
int main () 
{ 
    int n = 8;
    cin>>n;
    cout << "The term "<<n<<" in the fibonacci series is "<<fib(n); 
    getchar(); 
    return 0; 
} 