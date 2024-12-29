// Aditikrishna Mandula
// Sep 14 2023
// P 3.18
/*Taking in a status (either single or married) and a taxable income value, the program
outputs the tax the user is required to pay.
*/
#include <iostream>
using namespace std;
int main()
{
    //define variables and get input
    string status = "";
    int taxable_income = 0;
    double tax = 0; 
    cout << "Input your status and taxable income values below:" << endl;
    cin >> status >> taxable_income;
    if(status == "Single") // takes care of single income tax brackets
    {
        // goes from most specific to least specific by traversing tax in reverse order
        if(taxable_income > 32000)
        {
            tax = 4400 + 0.25 * (taxable_income - 32000);
        }
        else if(taxable_income > 8000)
        {
            tax = 800 + 0.15 * (taxable_income - 8000);
        }
        else
        {
            tax = 0.1 * taxable_income;
        }
        
    }
    else // takes care of married income tax brackets
    {
        // goes from most specific to least specific by traversing tax in reverse order
        //changed from above because married income = x2 the money
        if(taxable_income > 64000)
        {
            tax = 8800 + 0.25 * (taxable_income - 32000);
        }
        else if(taxable_income > 16000)
        {
            tax = 1600 + 0.15 * (taxable_income - 8000);
        }
        else
        {
            tax = 0.1 * taxable_income;
        }
    }
    cout<<tax<<endl;
}