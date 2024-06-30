#include <iostream>
#include <stdio.h>
using namespace std;

int main()
{
	cout << "Dean Meyer" << endl;

	cout << "Now you got to guess the correct number\n";

	int iNum = rand() % 50;

	int iAns;
	
	int iTries = 0;

	do {
		
		cin >> iAns;
		if (iAns > iNum) {
			cout << "The number you have guessed is too high\n";
		}
		else if (iAns < iNum) {
			cout << "The number you have guessed is too low\n";
		}

		iTries = iTries + 1;

		cout << "Try Again...\n";

	} while (iNum != iAns);

	cout << "Congratulations, You have won the number guessing game! Hooray\n";
	cout << "It took you " << iTries << " tries to guess the number " << iNum;
	return 0;

	
}

