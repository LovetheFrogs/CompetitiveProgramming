#include <iostream>
#include <cstdio>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    int n, b, h, w, p, nr;
    while (scanf("%d %d %d %d", &n, &b, &h, &w) == 4) {
        int minc = INT32_MAX;
        while (h--) {
            cin >> p;
            for (int i = 0; i < w; i++) {
                cin >> nr;
                if (nr >= n) {
                    minc = min(minc, n * p);
                }
            }
        }
        if (minc <= b) cout << minc << endl;
        else cout << "stay home" << endl;
    }

    return 0;
}
