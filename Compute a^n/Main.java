#include <iostream> 
using namespace std; 
int FindPower(int base, int power) {
   if (power == 0)
      return 1;
   else
      return (base * FindPower(base, power-1));
}  
int main() {
   int a,n;
   cout<<"Enter the value of a";
   cin>>a;
   cout<<"\nEnter the value of n";
   cin>>n;
   cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<FindPower(a,n);
   return 0;
}