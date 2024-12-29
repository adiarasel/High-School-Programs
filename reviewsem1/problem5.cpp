#include <iostream>
#include <cmath>
#include <string>
using namespace std;
//Problem 5
string longest_string(string array[], int n)
{
    int index = 0;
    int max_length = 0;
    for(int i = 0; i < n; i++)
    {
        if(array[i].length() >= max_length)
        {
            cout<<"true"<<endl;
            max_length = array[i].length();
            index = i;
        }
    }
    return array[index];
}

int main() {
    string stringg[4] = {"abd", "lawclub", "compsciwins", "booh"};
    cout<<longest_string(stringg, 4);
}