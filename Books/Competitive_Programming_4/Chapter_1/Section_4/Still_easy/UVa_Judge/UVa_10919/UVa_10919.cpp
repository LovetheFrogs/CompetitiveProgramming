#include <stdio.h>
#include <set>

using namespace std;

int main() {
    while (true) {
        int k, m, i, aux;
        scanf("%d", &k);
        if ( k == 0 ) break;
        scanf("%d", &m);
        set<int> s;
        for (i = 0; i < k; i++) {
            scanf("%d", &aux);
            s.insert(aux);
        }
        bool a = true;
        for (i = 0; i < m; i++) {
            int c, r, cu = 0, j;
            scanf("%d %d", &c, &r);
            for (j = 0; j < c; j++) {
                scanf("%d", &aux);
                if (a && s.find(aux) != s.end()) cu++;
            }
            if (cu < r) a = false;
        }
        printf(a ? "yes\n" : "no\n");
    }
}
