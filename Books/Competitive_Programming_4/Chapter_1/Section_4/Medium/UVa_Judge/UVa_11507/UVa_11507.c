#include <stdio.h>
#include <string.h>

int main()
{
    char s[10];
    
    while ( scanf("%s", s) != EOF && strcmp(s, "0") != 0 )
    {
        char fin[3] = "+x";
        int l = atoi(s);
        char d[3];
        int j;
        for ( j = 0; j < l - 1; j++ )
        {
            scanf("%s", d);
            if ( strcmp(d, "+z") == 0 )
            {
                if ( strcmp(fin, "+x") == 0 ) strcpy(fin, "+z");
                else if ( strcmp(fin, "+z") == 0 ) strcpy(fin, "-x");
                else if ( strcmp(fin, "-x") == 0 ) strcpy(fin, "-z");
                else if ( strcmp(fin, "-z") == 0 ) strcpy(fin, "+x");
            } 
            else if ( strcmp(d, "-z") == 0 )
            {
                if ( strcmp(fin, "+x") == 0 ) strcpy(fin, "-z");
                else if ( strcmp(fin, "+z") == 0 ) strcpy(fin, "+x");
                else if ( strcmp(fin, "-x") == 0 ) strcpy(fin, "+z");
                else if ( strcmp(fin, "-z") == 0 ) strcpy(fin, "-x");
            }
            else if ( strcmp(d, "+y") == 0 )
            {
                if ( strcmp(fin, "+x") == 0 ) strcpy(fin, "+y");
                else if ( strcmp(fin, "+y") == 0 ) strcpy(fin, "-x");
                else if ( strcmp(fin, "-x") == 0 ) strcpy(fin, "-y");
                else if ( strcmp(fin, "-y") == 0 ) strcpy(fin, "+x");
            }
            else if ( strcmp(d, "-y") == 0 )
            {
                if ( strcmp(fin, "+x") == 0 ) strcpy(fin, "-y");
                else if ( strcmp(fin, "+y") == 0 ) strcpy(fin, "+x");
                else if ( strcmp(fin, "-x") == 0 ) strcpy(fin, "+y");
                else if ( strcmp(fin, "-y") == 0 ) strcpy(fin, "-x");
            }
        }
        printf("%s\n", fin);
    }

    return 0;
}
