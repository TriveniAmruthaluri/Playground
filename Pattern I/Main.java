#include <iostream>
using namespace std;
int main()
{
    int i,j,s,count=0;
    cin >> s;
    for(i=s;count<4;count++)
    {
        for(j=0;j<count+1;j++)
            cout << i;
        cout << endl;
        i=i+1;
    }
    for(i=s+5-2;count>0;count--)
    {
        for(j=0;j<count;j++)
            cout << i;
        cout << endl;
        i=i-1;
    }
    return 0;
}