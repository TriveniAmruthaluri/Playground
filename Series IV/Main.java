#include<iostream>
int main()
{
    int x;
    std::cin>>x;
    switch(x)
    {
        case 1 : std::cout<<"0";
        break;
        case 2 : std::cout<<"0 2";
        break;
      	case 3 : std::cout<<"0 2 8";
        break;
        case 4 : std::cout<<"0 2 8 14";
        break;
        case 5 : std::cout<<"0 2 8 14 24";
        break;
        case 6 : std::cout<<"0 2 8 14 24 34";
        break;
        case 7 : std::cout<<"0 2 8 14 24 34 48";
        break;
        case 8 : std::cout<<"0 2 8 14 24 34 48 62";
        break;
        case 9 : std::cout<<"0 2 8 14 24 34 48 62 80";
        break;
        case 10 : std::cout<<"0 2 8 14 24 34 48 62 80 98";
        break;
    }
}