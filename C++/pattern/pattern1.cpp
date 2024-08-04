#include <iostream>
using namespace std;

int main(){

  int length = 0;

  cout << "Enter the any number: ";
  cin >> length;

  /*
   1 2 3 4
   1 2 3 4
   1 2 3 4
   1 2 3 4
   */

  for (int i = 1; i <= length; i++) {
    for(int j = 1; j <= length; j++) {
      cout << j << " ";
    }
    cout << endl;
  }

  return 0;
}

