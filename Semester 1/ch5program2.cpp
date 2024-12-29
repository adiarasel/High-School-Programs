// Aditikrishna Mandula
// 10/18/23
// 5.28
//Checks for palindromes using a recursive function.
#include <iostream>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;
/**
 * function: checks for a palindrome using recursion
 * @params:
 * string x , the input string 
 * @returns: 
 * boolean, true or false based on whether the string is a palindrome
*/


bool check_for_palindrome(string x)
{
    if(x.length() == 1)
    {
        return true;
    }
    else if(x.length() == 2)
    {
        if(x[0] == x[1]) return true;
        else return false;
    }
    else
    { // checks for recursive and for edges
        // cout<<x[0]<<" "<<x[x.length()-1]<<endl;
        return x[0] == x[x.length()-1] && check_for_palindrome(x.substr(1, x.length() - 2)); 
    }
}

int main()
{
    string x = "paap";
    bool okay = check_for_palindrome(x);
    cout<<okay<<endl;
}