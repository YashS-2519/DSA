#include <iostream>
using namespace std;

int main () {

  int length = 0, c = 1;

  cout << "Enter any number: ";
  cin >> length;

  /*
   1 2 3
   4 5 6
   7 8 9
  */

  for (int i = 0; i <= length; i++) {
    for (int j = 0; j <= length; j++) {
      cout << c++ << " ";
    }
    cout << endl;
  }


  return 0;
}
