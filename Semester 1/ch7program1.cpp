// Aditikrishna Mandula
// 11/16/23
// 7.2
//This program uses pointers in order to replace a value if it's greater than another value.
#include <iostream>
#include <cmath>
#include <string>
#include <vector>
#include <stack>
#include <map>
#include <set>
#include <queue>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;

double replace_if_greater(double* p, double x)
{
    double ret = *p;
    if(x > *p) p = &x;
    return ret;
}

int main()
{
    
}