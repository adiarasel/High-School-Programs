// Aditikrishna Mandula
// 10/2/2023
// 4.26
//This program simulates the Monty Hall Problem in a 100 iterations to prove or disprove
// the fact that the probability changes when you pick a different door.
#include <iostream>
#include <cmath>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;

int main()
{
    int car_door, door_player, goat_door;
    int counter_strat1 = 0, counter_strat2 = 0;
    int randboolean;
    srand(time(0));
    FOR(i, 1000)
    {
        car_door = rand() % 3 + 1; // assigns car to 1 door
        door_player = rand() % 3 + 1; // player picks door
        //section where host picks door doesn't matter because no matter what the goat door
        if(car_door == door_player) counter_strat1++;
        else counter_strat2 ++;
    }
    cout<<"Strategy 1: "<<counter_strat1<<" "<<"Strategy 2: "<<counter_strat2<<endl;
}