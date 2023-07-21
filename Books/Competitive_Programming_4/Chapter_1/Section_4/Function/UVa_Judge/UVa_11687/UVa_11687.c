#include <stdio.h>
#include <math.h>
#include <string.h>

int main()
{   
    char inp[1000010];
    while (scanf("%s", inp), inp[0] != 'E')
    {
        if (strlen(inp) == 1 && inp[0] == '1') printf("1\n");
        else
        {
            int i = 2;
            int prev = strlen(inp);
            int cur = (int) log10(prev) + 1;
            while (cur != prev)
            {
                prev = cur;
                cur = (int) log10(prev) + 1;
                i++;
            }
            printf("%d\n", i);
        }
    }
}
