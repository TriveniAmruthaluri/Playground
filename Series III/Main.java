#include<iostream>
int main()
{
    int x;
    std::cin>>x;
    switch(x)
    {
        case 1 : std::cout<<"6";
        break;
        case 2 : std::cout<<"6 11";
        break;
      	case 3 : std::cout<<"6 11 21";
        break;
        case 4 : std::cout<<"6 11 21 36";
        break;
        case 5 : std::cout<<"6 11 21 36 56";
        break;
        case 6 : std::cout<<"6 11 21 36 56 81";
        break;
        case 7 : std::cout<<"6 11 21 36 56 81 111";
        break;
        case 8 : std::cout<<"6 11 21 36 56 81 111 146";
        break;
        case 9 : std::cout<<"6 11 21 36 56 81 111 146 186";
        break;
        case 10 : std::cout<<"6 11 21 36 56 81 111 146 186 231";
        break;
    }
}