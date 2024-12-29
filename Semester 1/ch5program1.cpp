// Aditikrishna Mandula
// October 16, 2023
// 5.15
// Uses reference parameters in order to sort three numbers within the inputted variables
#include <iostream>
#include <cmath>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;
/**
 * function: takes in 3 numbers and sorts them in ascending order
 *@params:
 * int a, a reference variable
 * int b, a reference variable
 * int c, a reference variable
 * no returns
 */

void sort3(int& a, int& b, int& c)
{
    int temp1 = a;
    int temp2 = b;
    int temp3 = c;
    if(a < b)
    {
        if(a < c)
        {
            if(b > c)
            {
                // should be values of a, c, b
                a = temp1;
                b = temp3;
                c = temp2;
            }
            else // the correct order a, b, c
            {
                a = temp1;
                b = temp2;
                c = temp3;
            }
            
        }
        else
        {
            // should be c, a, b
            a = temp1;
            b = temp3;
            c = temp2;
        }
    }
    else
    {
        if(a < c)
        {
            // should be values of b, a, c
            a = temp2;
            b = temp1;
            c = temp3;
        }
        else
        {

            if(b < c)
            {
                // should be b, c, a 
                a = temp2;
                b = temp3;
                c = temp1;
            }
            else
            {
            // should be c, b, a
                a = temp3;
                b = temp2;
                c = temp1;
            }
        }
    }
}
int main()
{
    int x = 3, y = 1, z = 2;
    sort3(x, y, z);
    cout<<x<<" "<<y<<" "<<z<<" "<<endl;
}