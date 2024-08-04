#include <iostream>
using namespace std;

int main(){

  int length = 0;

  cout << "Enter any number: ";
  cin >> length;

  /*
  3 2 1
  3 2 1
  3 2 1
  */

  for (int i = 1; i <= length; i++) {
    for (int j = 1; j <= length; j++) {
      cout << length - j + 1 << " ";
    }
    cout << endl;
  }

  return 0;
}
