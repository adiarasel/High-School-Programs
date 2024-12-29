// Aditikrishna Mandula
// 10/18/24
// 5.28
//Checks for palindromes using a recursive function.
#include <iostream>
#include <utility>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;
struct relation
{
    int x;
    int y;
};
/**
 * function: tests to see if the relation is symmetric
 * @params: 
 * relation array[]: an array of relations to be tested
 * int n: the size of the relations array
 * @return: the boolean saying if the entire relation is symmetric or not
*/
bool symmetric (relation array[], int n)
{
    bool reflexive_pair_exists = false;
    int numpairs = 0;
    FOR(i, n)
    {
        int xx = array[i].x;
        int yy = array[i].y;
        FOR(j, n)
        {
            if(xx == array[j].y && yy == array[j].x)
            {
                reflexive_pair_exists = true;
            }
        }
        if(reflexive_pair_exists)
        {
            numpairs++;
            reflexive_pair_exists = false;
        }
    }
    if(numpairs == n) return true;
    else return false;
}
/**
 * function: tests to see if the relation is reflexive
 * @params: 
 * relation array[]: an array of relations to be tested
 * int n: the size of the relations array
 * int domain[]: the set of all the integers used in the relation
 * int s: the size of the domain array 
 * @return: the boolean saying if the entire relation is reflexive or not
*/
bool reflexive(relation array[], int n, int domain[], int s)
{
    bool reflexive_pair_exists = false;
    int numpairs = 0;
    FOR(i, s)
    {
        int xx = domain[i];
        FOR(j, n)
        {
            if(xx == array[j].y && xx == array[j].x)
            {
                reflexive_pair_exists = true;
            }
        }
        if(reflexive_pair_exists)
        {
            numpairs++;
            reflexive_pair_exists = false;
        }
    }
    if(numpairs == s) return true;
    else return false;
}
int main()
{
    int domain1[] = {1, 2, 3};
    relation reflexive_symmetric[] = {{1, 1}, {2, 2}, {3, 3}, {1, 2}, {2, 1}, {3, 1}, {1, 3}};
    cout<<symmetric(reflexive_symmetric, 7)<<" "<< reflexive(reflexive_symmetric, 7, domain1, 3)<<endl;
    int domain2[] = {1, 2, 3, 4, 5};
    relation reflexive_nsymmetric[] = {{1, 1}, {2, 2}, {3, 3}, {1, 2}, {4, 1}, {3, 1}, {1, 5}, {4, 4}, {5, 5}};
    cout<<symmetric(reflexive_nsymmetric, 9)<<" "<< reflexive(reflexive_nsymmetric, 9, domain2, 5)<<endl;
    int domain3[] = {1, 2, 3, 4, 5};
    relation nreflexive_symmetric[] = {{1, 2}, {2, 1}, {3, 1}, {1, 3}, {1, 4}, {4, 1}, {1, 5}, {5, 1}};
    cout<<symmetric(nreflexive_symmetric, 8)<<" "<< reflexive(reflexive_symmetric, 8, domain3, 5)<<endl;
    int domain4[] = {1, 2, 3, 4, 5, 6, 7};
    relation nreflexive_nsymmetric[] = {{1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}};
    cout<<symmetric(nreflexive_nsymmetric, 7)<<" "<< reflexive(nreflexive_nsymmetric, 7, domain4, 7)<<endl;
}