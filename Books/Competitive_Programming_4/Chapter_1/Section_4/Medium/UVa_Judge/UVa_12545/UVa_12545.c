#include <stdio.h>
#include <string.h>

int main()
{
    int c, i;
    scanf("%d", &c);
    for ( i = 0; i < c; i++ )
    {
        printf("Case %d: ", i + 1);
        char s[101], t[101];
        scanf("%s", s);
        scanf("%s", t);
        int d = 0, od = 0, n1 = 0, n2 = 0, j;
        for ( j = 0; j < strlen(s); j++ )
        {
            if ( s[j] != t[j] ) d++;
            if ( s[j] == '?' && t[j] == '1' ) od--;
            else if ( s[j] == '0' && t[j] == '1' )
            {
                n2++;
                od--;
            }
            else if ( s[j] == '1' && t[j] == '0' )
            {
                n1++;
                od++;
            }
        }
        int min;
        if ( n1 < n2 ) min = n1;
        else min = n2;
        if ( od > 0 ) printf("-1\n");
        else printf("%d\n", d - min);
    }
}
