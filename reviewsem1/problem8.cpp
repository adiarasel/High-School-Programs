#include <iostream>
#include <cmath>
#include <string>
using namespace std;
//Problem 8
bool palindrome_check(string str)
{
    bool is_a_palindrome = true;
    int n = str.length();
    for(int i = 0; i < n / 2 + 1; i++)
    {
        if(str[i] != str[n - 1 - i]) is_a_palindrome = false;
    }
    return is_a_palindrome;
}
int main() {
    cout<<palindrome_check("HANNAH");
}