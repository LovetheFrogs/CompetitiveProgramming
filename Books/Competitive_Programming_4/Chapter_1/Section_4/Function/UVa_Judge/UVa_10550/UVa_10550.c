#include <stdio.h>

int main()
{
    int s, a, b, c;
    scanf("%d %d %d %d", &s, &a, &b, &c);
    while ( s != 0 || a != 0 || b != 0 || c != 0 )
    {
        int sol = 120;
        sol += ((s += a > s ? 40 : 0) - a);
        sol += (b - (a -= a > b ? 40 : 0));
        sol += ((b += c > b ? 40 : 0) - c);
        printf("%d\n", sol * 9);
        scanf("%d %d %d %d", &s, &a, &b, &c);
    }
}
