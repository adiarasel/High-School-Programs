// Aditikrishna Mandula
// August 29 2023
// Program 2.6
//This program converts a measurement in meters to a measurement in miles, feet, and inches.
#include <iostream>
using namespace std;

int main()
{
    //taking in input
    cout<<"Please input a measurement in meters:"<<endl;
    double numbermeters = 0; 
    cin>> numbermeters;
    //defines all conversion constants
    double meterstomile = 0.000621371;
    double meterstoinch = 39.3701;
    double meterstofeet = 3.28084;
    //outputs and converts in three lines instead of six
    cout<<"In feet: "<< numbermeters * meterstofeet<<endl;
    cout<<"In miles: "<< numbermeters * meterstomile<<endl;
    cout<<"In inches: "<< numbermeters * meterstoinch<<endl;
    return 0;
}