// Aditikrishna Mandula
// October 27 2023
// 6.2C
//IT switches all the elemtns in the array to 0
#include <iostream>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;

void evento0(int array[], int length)
{
    for(int i = 1; i < length; i+=2)
    {
        array[i] = 0;
    }
}
int main()
{
    int array[10];
    evento0(array, sizeof(array)/sizeof(array[0]));
    FOR(i, sizeof(array)/sizeof(array[0]))
    {
        cout<<array[i]<<" ";
    }
    
}