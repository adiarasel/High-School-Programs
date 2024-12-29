// Aditikrishna Mandula
// August 29 2023
// Program 2.18
//This program takes in a number that has a comma in it and outputs the number without the comma in it.
#include <iostream>
#include <string>
using namespace std;

int main()
{
    // Taking in an input
    cout<<"Please enter an integer between 1,000 and 999,999: "<<endl;
    string input;
    cin>>input;
    //finding the length of the input
    int lengthofinp = input.length();
    //removing the comma from the number via the function substring
    string final_num = input.substr(0, lengthofinp - 4) + input.substr(lengthofinp - 3);
    cout<<final_num<<endl;
    return 0;
}