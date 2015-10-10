#include <stdio.h>
#include <math.h>
long int mod_binary(long int a, long int e, long int m) { // O(n) a^e mod m = ((a % m) (a % m) .. (a % m)) %m
    if (e == 1) {
        return a % m;
    } else if (e == 0) {
        return 1;
    } else {
        long int result = mod_binary(a, e / 2, m);
        if (e % 2 == 1) {
            long int temp = (result * result) % m;
            temp *= (a % m);
            temp %= m;
            return temp;
        } else {
            return (result * result) % m;
        }
    }
}

int main() {
    int cases, a, m;
    
    scanf("%d", &cases);
    while (cases--) {
        scanf("%d %d", &a, &m);
        long long result = mod_binary(a, ((m - 1)/2), m);
        if (result == 1 || a == 0 || a == 2) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }
        
    }
    return 0;
}