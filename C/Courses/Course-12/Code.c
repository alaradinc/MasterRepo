#include <stdio.h>

int main() {
    /*
                FILES
        
        1. Text Files
        2. Binary Files

        File Operations:
        1. Create
        2. Open
        3. Read
        4. Write
        5. Close

        File Modes:
        1. r - read
        2. w - write
        3. a - append   
        4. r+ - read and write
        5. w+ - read and write
        6. a+ - read and write
        7. rb - read binary
        8. wb - write binary
        9. ab - append binary
        10. rb+ - read and write binary
        11. wb+ - read and write binary
        12. ab+ - read and write binary

        File Handling Functions:
        1. fopen() - open file
        2. fclose() - close file
        3. fgetc() - read character
        4. fputc() - write character
        5. fgets() - read string
        6. fputs() - write string
        7. fscanf() - read formatted input
        8. fprintf() - write formatted output
        9. fread() - read block of data
        10. fwrite() - write block of data
    */

    // Writing to the binary file

    // FILE *file = fopen("file.bin", "wb");

    // if (file == NULL) {
    //     printf("File not found\n");
    //     return 1;
    // }

    // int arr[] = {1, 2, 3, 4, 5};        // struct Student alara;    ==> alara is an object of type struct Student
    // fwrite(arr, sizeof(int), 5, file);  // we can place 'struct object' directly in size because it is predetermined
    //                                     // for arrays, we input the type of object held in the array as well as it's count (manual determination)

    // fclose(file);
    // printf("Data written to the file\n");

    // // Reading from the binary file

    // file = fopen("file.bin", "rb");

    // if (file == NULL) {
    //     printf("File not found\n");
    //     return 1;
    // }

    // int arr2[5];
    // fread(arr2, sizeof(int), 5, file);

    // printf("Data read from the file: ");
    // for (int i = 0; i < 5; i++) {
    //     printf("%d ", arr2[i]);
    // }

    fclose(file);
    return 0;
}