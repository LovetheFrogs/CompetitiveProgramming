#include <stdio.h>

int main() 
{
    int a, b, c, t, aux;
    int cs = 0;
    scanf("%d", &t);
    while (t--)
    {
        scanf("%d %d %d", &a, &b, &c);
        if (a > c) aux = a, a = c, c = aux;
        if (b > c) aux = b, b = c, c = aux;
        if (a > b) aux = a, a = b, b = aux;
        printf("Case %d: %d\n", ++cs, b);
    }
    return 0;
}
