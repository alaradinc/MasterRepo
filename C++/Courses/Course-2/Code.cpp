#include <iostream>
using namespace std;
void inputScores(int array[], int size);
double calculateAvg(int array[], int size);
int countAboveThreshold(int array[], int size, int threshold);
int findMaxScore(int array[], int size);


int main()
{
    int nStu, threshold;
    cout << "Enter the number of students in the class: ";
    cin >> nStu;

    int *testScores = new int[nStu]; // int testScores[nStu]; - this is dynamic allocation

    cout << "Input each student's scores: ";
    inputScores(testScores, nStu);

    cout << "Input threshold: ";
    cin >> threshold;

    cout << "Average score: " << calculateAvg(testScores, nStu) << endl;
    cout << "Number of students above threshold: " << countAboveThreshold(testScores, nStu, threshold) << endl;
    cout << "The maximum score is: " << findMaxScore(testScores, nStu) << endl;

    return 0;
}

double calculateAvg(int array[], int size)
{   // *array and array[] are both int pointers and can be used interchangably
    // we must input the size of the function, this is not something we can calculate
    // because array[] is a pointer 'sizeof' will return 8 bytes, because any type of pointer is 8 byte on RAM

    int sum = 0;

    for (int i = 0; i < size; i++)
    {
        sum += array[i];
    }

    double avg = (double)sum / size; // typecast one of the variables into double so your result is a double
    return avg;
}

int countAboveThreshold(int array[], int size, int threshold)
{
    int count = 0;

    for (int i = 0; i < size; i++)
    {
        if (array[i] >= threshold)
        {
            count++;
        }
    }

    return count;
}

int findMaxScore(int array[], int size)
{

    int max = array[0]; // you should assign first variable of array instead of something like '0' because what if the whole array is negative

    for (int i = 0; i < size; i++)
    {
        if (array[i] > max)
        {

            max = array[i];
        }
    }

    return max;
}

void inputScores(int array[], int size){

    for (int i = 0; i < size; i++)
    {
        cin >> array[i];
    }
    
}