#include <stdio.h>

int main()
{
    while ( 1 )
    {
        int h, d, f;
        float u;
        scanf("%d %f %d %d", &h, &u, &d, &f);
        if ( h == 0 ) break;
        float c = 0.0f;
        int day = 0;
        float ff = 0.1f;
        ff = u * f / 100;
        while ( 1 )
        {
            day++;
            if ( u > 0 ) c += u;
            u = u - ff;
            if ( c > h ) break;
            c = c - d;
            if ( c < 0 ) break;
        }
        if ( c < 0 ) printf("failure on day %d\n", day);
        else printf("success on day %d\n", day);
    }
}
