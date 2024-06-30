#include <iostream>
using namespace std;
float num1, num2, option;
float ans;

void intro()
{
    cout << "Hi, welcome to my math program\n";
    cout << "Enter your first number:\n";
    cin >> num1;
    cout << "Enter your second number:\n";
    cin >> num2;
}

void options()
{
    cout << "What would you like to do?\n";
    cout << "1. Plus\n";
    cout << "2. Minus\n";
    cout << "3. Multiply\n";
    cout << "4. Divide\n";

    cin >> option;
}

void sum()
{
    if (option == 1)
    {
        ans = num1 + num2;
    }

    if (option == 2)
    {
        ans = num1 - num2;
    }

    if (option == 3)
    {
        ans = num1 * num2;
    }

    if (option == 4)
    {
        ans = num1 / num2;
    }
}

int main(int argc, char *argv[])
{
    //	int num1, num2, option, ans;

    intro();

    options();

    sum();

    cout << "The answer is: " << ans;
    
    

    return 0;
}
