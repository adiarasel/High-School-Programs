// Aditikrishna Mandula
// April 29, 2024
// 2.7
//Finds the Closest Pair in a set of points!
#include <iostream>
#include <algorithm>
#include <cmath>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;
struct coord
{
    int x;
    int y;
};
bool compx (coord a, coord b)
{
    return a.x <= b.x;
}
bool compy (coord a, coord b)
{
    return a.y <= b.y;
}
pair <coord, coord> find_pair(coord p[], int n)
{
    sort(p, p + n, compy);
    int d = INT_MAX;
    pair<coord, coord> ans;
    FOR(i, n-1)
    {
        if (distance(p[i].x, p[i+1].x, p[i].y, p[i+1].y) < d)
        {
            d = distance(p[i].x, p[i+1].x, p[i].y, p[i+1].y);
            ans = make_pair(p[i], p[i+1]);
        }
    }
    return ans;
}
int distance(int x1, int x2, int y1, int y2)
{
    return abs((x1 - x2) * (x1 - x2)) +
     abs((y1 - y2) * (y1 - y2));
}
int main()
{
    int p[] = {1, 2, 3, 4, 5, 6 ,7};
    int q[] = {8, 9, 10, 11, 12, 13, 14};
    coord array[7];
    FOR(i, 7)
    {
        array[i].x = p[i];
        array[i].y = q[i];
    }
    cout<<find_pair(array, 7).first.x<<" "<< find_pair(array, 7).first.y<<endl;
    cout<<find_pair(array, 7).second.x<<" "<< find_pair(array, 7).second.y<<endl;
}