#include <iostream>
#include <string>
using namespace std;

struct {
    string name;
    string middle;
}
fullname1, fullname2;

int main(int argc, char *argv[])
{
	
	fullname1.name = "Allis";
	fullname1.middle = "Terblance";
	
	fullname2.name = "John";
	fullname2.middle = "Doe";
	
	cout << fullname2.name + fullname1.middle;
	
}