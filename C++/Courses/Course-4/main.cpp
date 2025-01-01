#include <iostream>
using namespace std;

void swap_call_by_value(int a, int b);
void swap_call_by_reference(int &a, int &b);
void swap_call_by_pointer(int* a, int* b);

int main() {
    // int num = 5;
    // cout << "Num is: " << num << endl;
    // cout << "Address of num is: " << &num << endl;
    //
    // // & is the address of operator
    //
    // int* p = &num; //&num = 123hcvna
    // cout << "Value of p is: " << p << endl; //&num = 123hcvna
    // cout << "Address of p is: " << &p << endl; //&p = 99hfgvs
    // cout << "Value at address p is: " << *p << endl; //&num = 123hcvna (because we look for 'content' of p

    // ---------------------------------------------------
    // int array[5];
    // for (int i = 0; i < 5; i++) {
    //     array[i] = i;
    // }
    // for (int i = 0; i < 5; i++) {
    //     cout << "Value at index " << i << " is: " << array[i] << endl;
    // }

    // int array[5];
    // for (int i = 0; i < 5; i++) {
    //     *(array+i) = i; //array is a pointer, so we can access the 'contents' via this structure
    // }
    // for (int i = 0; i < 5; i++) {
    //     cout << "Value at index " << i << " is: " << *(array+i) << endl;
    // }

    // ---------------------------------------------------

    /*
        Let user fill an array of integer that has 5 elements in it. Then print out the max and min value of the array.
        You are allowed to use [] only at the declaration of the array.
    */

    // int arr[5];
    //
    // cout << "Input 5 integers into our array: ";
    //
    // for (int i = 0; i < 5 ; i++) {
    //     cin >>  *(arr + i);
    // }
    //
    // int min = *(arr);
    // int max = *(arr);
    //
    // for (int i = 1; i < 5 ; i++) {
    //     if (min > *(arr + i)) { // we start 'i' from 1, so we do not have to write 'i + 1'
    //         min = *(arr + i);
    //     }
    //
    //     if (max < *(arr + i)) {
    //         max = *(arr + i);
    //     }
    // }
    //
    // cout << "Min: " << min << endl;
    // cout << "Max: " << max << endl;
    //
    // cout << "Array contents: ";
    // for (int i = 0; i < 5; i++) {
    //     cout << *(arr + i) << " ";
    // }
    //
    // cout << "Input 2 numbers: ";
    // int a, b;
    // cin >> a >> b;
    //
    // cout << "Call by Value Before swap: " << a << " " << b << endl; // 5 10
    // swap_call_by_value(a, b);
    // cout << "Call by Value After swap: " << a << " " << b << endl; // 5 10 (because we pass by value)
    //
    // cout << "Call by Reference Before swap: " << a << " " << b << endl; // 5 10
    // swap_call_by_reference(a, b);
    // cout << "Call by Reference After swap: " << a << " " << b << endl; // 10 5 (because we pass by reference)
    //
    // cout << "Call by Pointer Before swap: " << a << " " << b << endl; // 10 5
    // swap_call_by_pointer(&a, &b);
    // cout << "Call by Pointer After swap: " << a << " " << b << endl; // 5 10 (because we pass by pointer)
    //
    // // Different usages of *
    // int num = 5;
    // int* numPtr = &num; // * is used to declare a pointer
    // cout << "Value of num: " << *numPtr << endl; // * is used to get the value at the address
    // //                                             // * in this case does not have a 'type' before it, so it is calling 'content'
    // //
    // // // Different usages of &
    // cout << "Address of num: " << &num << endl; // & is used to get the address of an already defined variable
    // // &num = 123hfjd
    // int& numRef1 = num; // & is used to declare a reference    int& numRef = num; // & is used to declare a reference
    // //numRef is held in Compile, which is why it has the same address and content as num variable - because only 'num' is stored in RAM
    // // int numRef2 = num;
    // //
    // // numRef1 = 10;
    // // cout << "Value of num: " << num << endl; // 10
    // //
    // // numRef2 = 20;
    // // cout << "Value of num: " << num << endl; // 10
    //
    // // cout << "Value of numRef1: " << numRef1 << endl;
    // // cout << "Address of numRef1: " << &numRef1 << endl;
    // cout << "Value of num: " << num << endl;
    // cout << "Address of num: " << &num << endl;

    return 0;
}

// void swap_call_by_value(int a, int b) { //values will only swap in the function not in main (we use copies within function and do not modify original variables)
//     int temp = a;
//     a = b;
//     b = temp;
// }
//
// void swap_call_by_reference(int& a, int& b) { //you must provide addresses if you want to make changes permenant in the main function!
//                                             // we are calling for an integer type of pointer, NOT an integer a variable
//     int temp = a;
//     a = b;
//     b = temp;
// }
//
// void swap_call_by_pointer(int* a, int* b) { // create a 'pointer decleration' - so the values taken into this function are now 'addresses'
//                                             // this is why we send the address of a and b when using the function (&a, &b)
//     int temp = *a;
//     *a = *b;
//     *b = temp;
// }