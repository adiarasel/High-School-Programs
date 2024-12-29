// Aditikrishna Mandula
// 10/2/2023
// 4.1c
//This program uses a for loop to print out all the powers of 2 from 1 to 2^20.
#include <iostream>
#include <cmath>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;

int main()
{
    FOR(i, 21)
    {
        cout<<pow(2, i)<<endl;
    }
}