// Aditikrishna Mandula
// January 17, 2023
// Lab Chapter 1: Sets
//It implements the various functions of a set
#include <iostream>
#include<set>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;
set<int> set_of_ints; 
/**
 * function outputs the elements of a set
 * @params:
 * set of integers list_set
 * @return: none
 */
void list_elements (set<int> list_set)
{
    // Create an iterator for the set
    set<int>:: iterator iter;

    iter = list_set.begin();
    cout<<*iter;
    iter++;
    while(iter != list_set.end())
    {
        cout<<", "<<*iter;
        iter++;
    }
    cout<<endl;
}
/**
 * function determines the union of two functions
 * @params:
 * set of integers A
 * set of integers B
 * @return: set of integers that represents the union of functions A and B
 */
set<int> set_union(set<int> A, set<int> B)
{
    set<int>:: iterator iter;
    set<int> C;
    iter = A.begin();
    while(iter != A.end())
    {
        C.insert(*iter);
        iter++;
    }
    iter = B.begin();
    while(iter != B.end())
    {
        if(C.find(*iter) == C.end())
        {
            C.insert(*iter);
        }
        iter++;
    }
    return C;
}
/**
 * function determines the intersection of two functions
 * @params:
 * set of integers A
 * set of integers B
 * @return: set of integers that represents the intersection of functions A and B
 */
set<int> set_intersection(set<int> A, set<int> B)
{
    set<int>:: iterator iter;
    set<int>:: iterator iter2;
    set<int> C;
    iter = A.begin();
    iter2 = B.begin();
    while(iter != A.end())
    {
        if(B.find(*iter) != B.end())
        {
            C.insert(*iter);
        }
        iter++;
    }
    return C;
}
/**
 * function determines the set difference of two functions (A-B, not B-A)
 * @params:
 * set of integers A
 * set of integers B
 * @return: a set of integers that is the result of the set difference A - B
 */
set<int> set_difference(set<int> A, set<int> B)
{
    set<int> intersection = set_intersection(A, B);
    set<int>:: iterator iter;
    iter = A.begin();
    set<int> C;
    while(iter != A.end())
    {
        if(intersection.find(*iter) == intersection.end())
        {
            C.insert(*iter);
        }
        iter++;
    }
    return C;
}
/**
 * function determines if one is a subset of the other, but doesn't specify which
 * @params:
 * set of integers A
 * set of integers B, the set that is being checked for another set
 * @return: boolean telling us whether one set is the subset of another set
 */
bool subsets(set<int> A, set<int> B)
{
    set<int>:: iterator iter1;
    set<int>:: iterator iter2;
    iter1 = A.begin();
    iter2 = B.begin();
    bool equal = true;
    set<int> C;
    while(iter2 != B.end())
    {
        iter1 = A.find(*iter2);
        if(iter1 == A.end())
        {
            equal = false;
        }
        iter2++;
    }
    return equal;
}
int main()
{
    set<int> A;
    A.insert(1);
    A.insert(4);
    A.insert(7);
    set<int> B;
    B.insert(4);
    B.insert(5);
    cout<<"Set A: ";
    list_elements(A);
    cout<<endl<<"Set B: ";
    list_elements(B);
    cout<<endl<<"Difference of Set A and B: ";
    list_elements(set_difference(A, B));
    cout<<endl<<"Union of Sets A and B: ";
    list_elements(set_union(A, B));
    cout<<endl<<"Intersection of Set A and B: ";
    list_elements(set_intersection(A, B));
    cout<<endl<<"Is B a subset of A? (0 means no, 1 meeans yes): ";
    cout<<subsets(A, B)<<endl;
}