#include <stdio.h>

int main()
{
    long k, n, m, x, y;
    scanf("%d", &k);
    while ( 1 )
    {
        scanf("%d %d", &n, &m);
        while ( k-- )
        {
            scanf("%d %d", &x, &y);
            if ( x == n || y == m ) printf("divisa\n");
            else if ( x > n && y > m ) printf("NE\n");
            else if ( x > n && y < m ) printf("SE\n");
            else if ( x < n && y > m ) printf("NO\n");
            else if ( x < n && y < y ) printf("SO\n");
        }
        scanf("%d", &k);
        if ( k == 0 ) break;
    }
    return 0;
}