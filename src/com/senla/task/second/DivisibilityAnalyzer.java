package com.senla.task.second;

public class DivisibilityAnalyzer {

    //returns greatest common divisor of m and n
    public static int gcd(int m, int n){
        while (m!=n) {
            if (m>n) m = m - n;
            else n = n - m;
        }
        return m;
    }

    //returns least common multiple of m and n
    public static int lcm(int m, int n){
        return m*n/gcd(m, n);
    }
}
