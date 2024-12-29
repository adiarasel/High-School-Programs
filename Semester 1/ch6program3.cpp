// Aditikrishna Mandula
// November 3 2023
// 6.27
//It merges two vectors by alternating their elements.
#include <iostream>
#include <vector>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;
/**
this function merges two vectors by alternating their elements
@params : 
a : vector
b : vector
@return :
c : vector
 */
vector<int> merge(vector<int> a, vector<int> b)
{
    vector<int> c;
    int i = 0;
    for(i = 0; i < min(a.size(), b.size()); i++)
    {
        c.push_back(a[i]);
        c.push_back(b[i]);
    }
    if(a.size() < b.size())
    {
        for(i; i < b.size(); i++)
        {
            c.push_back(b[i]);
        }
    }
    else
    {
        for(i; i < a.size(); i++)
        {
            c.push_back(a[i]);
        }
    }
    return c;
}
int main()
{
    vector<int> a, b;
    FOR(i, 5) a.push_back(1);
    FOR(i, 5) b.push_back(2);
    vector<int> c = merge(a, b);
    FOR(i, 10)
    {
        cout<<c[i]<<endl;
    }
}