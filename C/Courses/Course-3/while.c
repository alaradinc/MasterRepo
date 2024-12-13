#include <stdio.h>

int main(int argc, char const *argv[])
{

    char text;
    int sum = 0;

    printf("He texted, want to reply? (y/n) ");
    scanf(" %c", &text);

    while (text == 'y')
    {
        printf("... text sent. Send another? (y/n) ");
        ++sum;
        scanf(" %c", &text);
        
    }

    printf("Total texts sent: %d\n", sum);
    
    return 0;
}
