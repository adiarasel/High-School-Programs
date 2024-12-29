// Aditikrishna Mandula
// 25 March 2024
// Program Number
//What does the program do
#include <iostream>
#include <cmath>
#define FOR(i, n) for(int i=0; i<n; i++)
#define For(i, n) for(int i=1; i<=n; i++)
using namespace std;
/*
 * function finds the factorial of a number n
 * @params: integer n, the number that I need to find the factorial of
 * @return: the factorial of n, n!
*/
int factorial(int n)
{
    int sum = 1;
    FOR(i, n)
    {
        sum *= (i+1);
    }
    return sum;
}
/*
 * function lists all the permutations of the numbers 1, 2, ..., n
 * @params: integer n, the max number in the array (arranging numbers 1 through n)
*/
void permutations(int n)
{
    int s[n+1];
    For(i, n)
    {
        s[i] = i;
        cout<<s[i]<<" ";
    }
    cout<<endl;
    for(int i = 2; i <= factorial(n); i++)
    {
        int m = n - 1;
        while(s[m] > s[m+1]) m -= 1;
        int k = n;
        while(s[m] > s[k]) k = k - 1;
        swap(s[m], s[k]);
        int p = m + 1;
        int q = n;
        while(p < q)
        {
            swap(s[p], s[q]);
            p++;
            q--;
        }
        For(i, n)
        {
            cout<<s[i]<<" ";
        }
        cout<<endl;
    }
}
int main()
{
    permutations(2);
}