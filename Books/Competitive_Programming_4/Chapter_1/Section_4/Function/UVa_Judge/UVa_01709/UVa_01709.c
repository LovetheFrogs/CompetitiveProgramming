#include <stdio.h>
#include <math.h>

int main()
{
    int p, a, b, c, d, n;
    while ( scanf("%d %d %d %d %d %d", &p, &a, &b, &c, &d, &n) == 6 )
    {
        double max_decline = 0;
        double max = p * (sin((a + b)) + cos((c + d)) + 2);
        int k = 2;
        while ( k <= n )
        {
            double aux = p * (sin((a * k + b)) + cos((c * k + d)) + 2);
            if ( max > aux)
            {
                if ( max_decline < max - aux )
                {
                    max_decline = max - aux;
                }
            } 
            else
            {
                max = aux;
            }
            k++;
        }
        printf("%.8lf\n", max_decline);
    }
    return 0;
}
