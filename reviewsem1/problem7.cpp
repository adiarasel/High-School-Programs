#include <iostream>
#include <cmath>
#include <string>
using namespace std;
//Problem 7
int char_frequency(string str, char c)
{
    int counter = 0;
    for(int i = 0 ;i < str.length(); i++)
    {
        if(str[i] == c) counter++;
    }
    return counter;
}
int main() {
    string s = "boolean";
    char c = 'o';
    cout<<char_frequency(s, c)<<endl;
}