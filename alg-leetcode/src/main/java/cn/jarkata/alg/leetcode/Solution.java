package cn.jarkata.alg.leetcode;

import java.util.Arrays;

/**
 * 把只包含质因子2，3和5的数称作丑数（Ugly Number）
 * <p>
 * 质因数（素因数或质因子）在数论里是指能整除给定正整数的质数。
 * 1与任何正整数（包括1本身）都是互质
 * 除了1以外，两个没有其他共同质因子的正整数称为互质
 * <a href="https://leetcode-cn.com/problems/ugly-number-ii/">264. 丑数 II</a>
 */
public class Solution {

    public int nthUglyNumber(int n) {
        int no = 0;
        int count = 0;
        int minVal = 1;
        while (true) {
            if (count == n) {
                return minVal;
            }
            int[] tmp = new int[3];
            if (minVal == 1) {
                tmp[0] = minVal * 2;
                tmp[1] = minVal * 3;
                tmp[2] = minVal * 5;
            } else {

            }


            Arrays.sort(tmp);
            minVal = tmp[0];
            System.out.println(minVal);
            count++;
        }
    }


    public static boolean isPrime(int n) {
        if (n <= 3) {
            return n > 1;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int t = sol.nthUglyNumber(11);
        System.out.println(t);
    }

}
