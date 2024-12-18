#include <iostream>
using namespace std;


int fibo(int n);

int main(){

    int n;
    cout << "Enter a number: ";
    cin >> n;

    cout << "The result is: " << fibo(n);

    return 0;
}

int fibo(int n){ // 5th number 1, 1, 2, 3, 5

    if (n == 0 || n == 1){
        return 1;
    }

    return fibo(n-1) + fibo(n-2);

}