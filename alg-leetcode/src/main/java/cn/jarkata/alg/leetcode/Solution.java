package cn.jarkata.alg.leetcode;

/**
 * 把只包含质因子2，3和5的数称作丑数（Ugly Number）
 * <p>
 * 质因数（素因数或质因子）在数论里是指能整除给定正整数的质数。
 * 1与任何正整数（包括1本身）都是互质
 * 除了1以外，两个没有其他共同质因子的正整数称为互质
 */
public class Solution {

    public int nthUglyNumber(int n) {
        int no = 0;
        int count = 0;
        while (true) {
            if (count == n) {
                return no;
            }
            no++;
            if (no == 1) {
                count++;
                continue;
            }
            if (no % 2 == 0 || no % 3 == 0 || no % 5 == 0) {
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int t = sol.nthUglyNumber(11);
        System.out.println(t);
    }

}
