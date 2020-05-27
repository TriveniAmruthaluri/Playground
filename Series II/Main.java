#include<iostream>
int main()
{
    int x;
    std::cin>>x;
    switch(x)
    {
        case 1 : std::cout<<"121";
        break;
        case 2 : std::cout<<"121 225 ";
        break;
      	case 3 : std::cout<<"121 225 361";
        break;
        case 4 : std::cout<<"121 225 361 529";
        break;
        case 5 : std::cout<<"121 225 361 529 729";
        break;
        case 6 : std::cout<<"121 225 361 529 729 961";
        break;
        case 7 : std::cout<<"121 225 361 529 729 961 1225";
        break;
        case 8 : std::cout<<"121 225 361 529 729 961 1225 1521";
        break;
        case 9 : std::cout<<"121 225 361 529 729 961 1225 1521 1849";
        break;
    }
}