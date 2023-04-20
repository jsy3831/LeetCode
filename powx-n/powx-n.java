class Solution {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        else if (x == 0 || x == 1 || n == 1)
            return x;

        if (n == Integer.MIN_VALUE) {
            x *= x;
            n /= 2;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double ans = 1.0;
        
        while (n > 0) {
            if (n % 2 == 1)
                ans *= x;
            
            x *= x;
            n /= 2;
        }

        return ans;
    }
}