// Aditikrishna Mandula
// March 6, 2024
// Lab Chapter 5: RSA
//It finds the gcd and finds the linear combination of the two numbers that yields the gcd.
#include <iostream>
#include <vector>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;
vector <int> final_coefficients;
vector <int> final_remainders;
/*
 * function finds the gcd of the two numbers
 * @params:
 * integer number 1, the greater of the two
 * integer number 2, the smaller of the two
 * @return: the gcd
*/
int gcd(int num1, int num2)
{
    int rem;
    final_coefficients.clear();
    final_remainders.clear();
    while ((num1 % num2) > 0)  {
        rem = num1 % num2;
        final_coefficients.push_back(num1/num2);
        final_remainders.push_back(rem);
        num1 = num2;
        num2 = rem;
    } 
    return num2;
}
/*
 * function sorts an array using the insertion array
 * @params:
 * integer number 1, the greater of the two
 * integer number 2, the smaller of the two
 * @return: a pair of integers representing the coefficients needed to produce the gcd
*/
pair<int, int> bezoutfinder(vector<int> remainders, vector<int> coefficients)
{
    int size = remainders.size();
    int answer_a = 1;
    int answer_b = coefficients[size-1];
    for(int i = size-1; i > 0; i--)
    {
        int save = answer_b;
        answer_b = answer_a + answer_b * coefficients[i-1];
        answer_a = save;
    }
    if (answer_a < answer_b) answer_a *= -1;
    else answer_b *= -1;
    pair<int, int> ans = make_pair(answer_a, answer_b);
    return ans;
}

int main()
{
    int num1, num2;
    cin>>num1>>num2;
    cout<<"gcd = "<< gcd(num1, num2)<<endl;
    pair<int, int> answer = bezoutfinder(final_remainders, final_coefficients);
    cout<<"First coefficient: "<< answer.first<<" Second coefficient: "<<answer.second<<endl;
}