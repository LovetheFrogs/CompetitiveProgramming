#include <stdio.h>

int main()
{
    int l, less;
    double d, p, dp[101];
    while (1)
    {
        scanf("%d %lf %lf %d", &l, &d, &p, &less);
        if ( l < 0 ) break;
        int m;
        double a;
        while ( less-- )
        {
            scanf("%d %lf", &m, &a);
            int i;
            for ( i = m; i < 101; i++ )
            {
                dp[i] = a;
            }
        }
        int aux = 0;
        double mp = p / l;
        double cv = (p + d) * (1 - dp[0]);
        double cl = p;
        while ( cv < cl )
        {
            aux++;
            cl -= mp;
            cv = cv * (1 - dp[aux]);
        }
        printf("%d month", aux);
        if ( aux != 1 ) printf("s");
        printf("\n");
    }
    return 0;
}
