#include <iostream>
#include <cmath>
#include <string>
using namespace std;
// Problem 1
float perimeter(int width, int height)
{
    float perimeter = width + height + sqrt(width * width + height * height);
    return perimeter;
}
int main() {
    cout<<perimeter(5, 6);
}