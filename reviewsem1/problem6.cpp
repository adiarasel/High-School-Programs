#include <iostream>
#include <string>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;
int main()
{
    bool valid = false;
    string input = "";
    int stringlen = 0;
    while(!valid)
    {
        cout<<"What license number would you like to input?"<<endl;
        cin>>input;
        stringlen = input.length();
        //checking validity of first and last character
        if(input[0] >= 'A' && input[0] <= 'Z' && input[stringlen - 1] >= 'A' && input[stringlen - 1] <= 'Z')
        {
            valid = true;
        }
        else
        {
            valid = false;
            cout<<"Invalid."<<endl;
            continue;
        }
        // checking for digits and uppercase letters only
        int numdigits = 0;
        for(int i = 1; i < stringlen - 1; i++)
        {
            if(input[i] >= 'A' && input[i] <= 'Z' || input[i] >= '0' && input[i] <= '9')
            {
                valid = true;
                if(input[i] >= '0' && input[i] <= '9')
                {
                    numdigits++;
                }
            }
            else{
                valid = false;
                cout<<"Invalid."<<endl;
                break;
            }
        }
        if(valid == false){
            cout<<"Invalid."<<endl;
            continue;
        }
        //checking for zero numbers
        if(numdigits == 0)
        {
            valid = false;
            cout<<"Invalid."<<endl;
        }
        else valid = true;
    }
}