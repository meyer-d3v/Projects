#include <cassert>
#include <iomanip>
#include <iostream>
#include <string>
#include <string_view>

using namespace std;

struct
{
    string name;
    string number;
} people;

int main(void)
{
    int i = 0;
    string name, c;
    int l;
    
    people.name = "John";
    people.number = "0123456789";
    
    

    cout << "Login(l) or Signup(s)\n";

    cin >> c;

    if (c == "s")
    {
        cout << "Please enter your name: ";

        cin >> people.name[1];

        cout << "Please enter your number: ";

        cin >> people.number[1];

        cout << "Succesfully added!";
    }

    if (c == "l")
    {
        cout << "What is your name?:";

        cin >> name;

        for (int l = people.name[l]; l < 2; l++)
        {
            if (l == people.name[l])
            {
                cout << people.number[l];
            }
            else
            {
                cout << "Number not found!";
                return 1;
            }
        }

        return 0;
    }
}