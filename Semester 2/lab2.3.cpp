// Aditikrishna Mandula
// February 16, 2024
// Lab Chapter 4: Insertion Sort
//It uses insertion sort to sort the array
#include <iostream>
#include<set>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;

/**
 * function sorts an array using the insertion array
 * @params:
 * integer array arr[]
 * integer size of array n
 * no @return
 */
void inssort(int arr[], int n)
{
    int i, spot, j;
    for (i = 1; i < n; i++) {
        spot = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > spot) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = spot;
    }
}
int main()
{
    int array[7] = {4, 3, 2, 5, 1, 6, 7};
    inssort(array, 7);
    FOR(i, 7)
    {
        cout<<array[i]<<" ";
    }
}