package plus.ldl;

/**
 * @author ldl.plus
 * @date 2020年03月06日  20:07
 * 罗马数字转整数
 */
public class Question13 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int i = new Solution().romanToInt1("MCMXCIV");
        long end = System.currentTimeMillis();
        System.out.println("end-start = " + (end - start));
        System.out.println("i = " + i);
    }
}

/**
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 */
class Solution {
    public int romanToInt(String s) {
        char[] array = s.toCharArray();
        int num = 0;
        for (char c : array) {
            if ('I' == c) {
                num += 1;
            }
            if ('V' == c) {
                num += 5;
            }
            if ('X' == c) {
                num += 10;
            }
            if ('L' == c) {
                num += 50;
            }
            if ('C' == c) {
                num += 100;
            }
            if ('D' == c) {
                num += 500;
            }
            if ('M' == c) {
                num += 1000;
            }
        }
        if (s.contains("IV") || s.contains("IX")) {
            num -= 2;
        }
        if (s.contains("XL") || s.contains("XC")) {
            num -= 20;
        }
        if (s.contains("CD") || s.contains("CM")) {
            num -= 200;
        }
        return num;
    }

    public int romanToInt1(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if (preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        return sum;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}