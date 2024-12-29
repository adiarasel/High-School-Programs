// Aditikrishna Mandula
// Sep 14 2023
// P 3.23
/*This converts any number less than 3999 into roman numerals.
*/
#include <iostream>
using namespace std;
#define FOR(i, n) for(int i=0; i<n; i++)
int main()
{
   // defining variables and getting inputs;
    int base10num = 0, digit_thousands = 0, digit_hundreds = 0, digit_tens = 0, digit_ones = 0;
    string string_thousands = "", string_hundreds = "", string_tens = "", string_ones = "";
    string final_string = "";
    // my game plan is to use mod (%) to split up the input number into 4 (or less) digits
    cout << "Please input the number you would like to convert into roman numerals!"<<endl;
    cin>>base10num;
    //using modular arithmetic to split the number into 4 digits
    digit_ones = base10num % 10;
    base10num /= 10;
    digit_tens = base10num % 10;
    base10num /= 10;
    digit_hundreds = base10num % 10;
    base10num /= 10;
    digit_thousands = base10num % 10;
    //we shall start with the thousands bc it's the easiest
    if(digit_thousands == 1)
    {
        string_thousands = "M";
    }
    else if (digit_thousands == 2)
    {
        string_thousands = "MM";
    }
    else if (digit_thousands == 3)
    {
        string_thousands = "MMM";
    }
    // hundreds digit
    if(digit_hundreds == 1)
    {
        string_hundreds = "C";
    }
    else if (digit_hundreds == 2)
    {
        string_hundreds = "CC";
    }
    else if (digit_hundreds == 3)
    {
        string_hundreds = "CCC";
    }
    else if (digit_hundreds == 4)
    {
        string_hundreds = "CD";
    }
    else if (digit_hundreds == 5)
    {
        string_hundreds = "D";
    }
    else if (digit_hundreds == 6)
    {
        string_hundreds = "DC";
    }
    else if (digit_hundreds == 7)
    {
        string_hundreds = "DCC";
    }
    else if (digit_hundreds == 8)
    {
        string_hundreds = "DCCC";
    }
    else if (digit_hundreds == 9)
    {
        string_hundreds = "CM";
    }
    //tens digit
    if(digit_tens == 1)
    {
        string_tens = "X";
    }
    else if (digit_tens == 2)
    {
        string_tens = "XX";
    }
    else if (digit_tens == 3)
    {
        string_tens = "XXX";
    }
    else if (digit_tens == 4)
    {
        string_tens = "XL";
    }
    else if (digit_tens == 5)
    {
        string_tens = "L";
    }
    else if (digit_tens == 6)
    {
        string_tens = "LX";
    }
    else if (digit_tens == 7)
    {
        string_tens = "LXX";
    }
    else if (digit_tens == 8)
    {
        string_tens = "LXXX";
    }
    else if (digit_tens == 9)
    {
        string_tens = "LC";
    }
    //unit digit
    if(digit_ones == 1)
    {
        string_ones = "I";
    }
    else if (digit_ones == 2)
    {
        string_ones = "II";
    }
    else if (digit_ones == 3)
    {
        string_ones = "IV";
    }
    else if (digit_ones == 4)
    {
        string_ones = "VI";
    }
    else if (digit_ones == 5)
    {
        string_ones = "V";
    }
    else if (digit_ones == 6)
    {
        string_ones = "VI";
    }
    else if (digit_ones == 7)
    {
        string_ones = "VII";
    }
    else if (digit_ones == 8)
    {
        string_ones = "VIII";
    }
    else if (digit_ones == 9)
    {
        string_ones = "IX";
    }
    //putting the final string together and outputting it
    final_string = string_thousands + string_hundreds + string_tens + string_ones;
    cout<<"The Roman Numeral version of the number you inputted is: "<< final_string<<endl;
}