#include <iostream>
#include <cmath>
#include <string>
using namespace std;
int main() {
    //Problem 3
    int age = 0;
    string name = "";
    cin>>age>>name;
    if(age == 1)
    {
        cout<<"Your name is "<<name<<" and you are "<<age<< " year old."<<endl;
    }
    else
    {
        cout<<"Your name is "<<name<<" and you are "<<age<< " years old."<<endl;
    }
    
}