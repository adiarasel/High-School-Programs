#include <iostream>
#include <cmath>
#include <string>
using namespace std;
//Problem 4
int sumofarray(int array[], int length)
{
    int sum = 0;
    for(int i = 0; i < length; i++)
    {
        sum += array[i];
    }
    return sum;
}

int main() {
    int array[4] = {1, 2, 3, 4};
    cout<<sumofarray(array, 4);
}