#include <stdio.h>

int main()
{
    int t, n, aux, ma = 0, cs = 0;
    scanf("%d", &t);
    while (t--)
    {
        ma = 0;
        scanf("%d", &n);
        while (n--)
        {
            scanf("%d", &aux);
            if (aux > ma) ma = aux;
        }
        printf("Case %d: %d\n", ++cs, ma);
    }
    return 0;
}
