// Aditikrishna Mandula
// Dec 6 2023
// Linked List Program
//This program creates a linked list, creates a function to add nodes to it, creates a function to delete it,
// and creates a function to print it out. 
#include <iostream>
#include <algorithm>
#include <cmath>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;

struct a_node
{ 
    int number_of_visitors;
    a_node* next_node;
};
/**
 * @params: 
 * a_node linked_list: the list that gets the value
 * int data_value: the value to be added to the list
 */
void insert_node(a_node*& linked_list, int data_value)
{
    if(linked_list != NULL){
        a_node* temp = linked_list;
        linked_list = new a_node;
        linked_list -> next_node = temp;
        linked_list -> number_of_visitors = data_value;
    }
    else
    {
        linked_list = new a_node;
        linked_list -> number_of_visitors = data_value;
        linked_list -> next_node = NULL;
    }
}
/**
 * @params: 
 * a_node linked_list: the list that gets the value deleted
 * @returns:
 * int: value that was deleted
 */
int delete_node(a_node*& linked_list)
{
    int data_value = -1;
    if(linked_list != NULL)
    {
        a_node* save_ptr = linked_list; // Save pointer to node
        linked_list = linked_list->next_node; // Link over node
        // Note: This removes the node from the linked list
        data_value = save_ptr->number_of_visitors;
        delete save_ptr; // Delete node
        // This means the memory has been given back
    }
    return data_value;
}
/**
 * @params: 
 * a_node linked_list: the list that gets the value
 */
void print_list(a_node*& linked_list)
{
    a_node* temp_node = linked_list;
    while (temp_node != NULL)
    {
        cout<<temp_node->number_of_visitors<<endl;
        temp_node = temp_node->next_node;
    }
}
int main()
{
    a_node* the_list;
    the_list = NULL;
    insert_node(the_list, 123);
    insert_node(the_list, 34);
    insert_node(the_list, 72);
    insert_node(the_list, 10);
    print_list(the_list);
    delete_node(the_list);
    print_list(the_list);
    insert_node(the_list, 15);
    print_list(the_list);
    delete_node(the_list);
    print_list(the_list);
    insert_node(the_list, 43);
    print_list(the_list);
    delete_node(the_list);
    print_list(the_list);
    insert_node(the_list, 78);
    print_list(the_list);
    delete_node(the_list);
    print_list(the_list);
}