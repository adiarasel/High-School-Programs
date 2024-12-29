// Aditikrishna Mandula
// Novermber 2, 2023
// 6.20
//Based on an odd integer n, which is the input, we output a magic square based on the algorithm provided.
#include <iostream>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;

int main()
{
    int n = 0;
    cin>>n;
    int row = n-1, column = n/2;
    int array[n][n];
    if (n % 2 != 0)
    {
        FOR(i, n)
        {
            FOR(j, n)
            {
                array[i][j] = 0;
            } 
        }
    }
    int temprow = 0;
    int tempcolumn = 0;
    for(int k = 1; k <= n * n; k++)
    {
        array[row][column] = k;
        temprow = row;
        tempcolumn = column;
        row++;
        column++;
        if(row == n) row= 0;
        if(column == n) row = 0;
        if (array[row][column] != 0)
        {
                row = temprow;
                column = tempcolumn;
                row--;
        }
    }
}