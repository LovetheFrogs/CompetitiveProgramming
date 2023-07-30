#include <stdio.h>

int main()
{
    int n, b, h, w, p, sol = __INT32_MAX__;
    scanf("%d %d %d %d", &n, &b, &h, &w);
    while ( h-- )
    {
        int aux = w;
        scanf("%d", &p);
        while ( aux-- )
        {
            int a;
            scanf("%d", &a);
            if ( a < n ) continue;
            else if ( n * p < sol ) sol = n * p;
        }
    }
    if ( sol <= b ) printf("%d", sol);
    else printf("stay home");
}
