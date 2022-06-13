/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
*/

public class RomanToInteger {
    public static void main(String[] args) {

        System.out.println(romanToInteger("MCMXCIV"));
    }
    public static int romanToInteger(String s) {
        int sum = 0;    // set placeholder variable to be used to indicate values of each roman numeral in string

        for (int i = 0; i < s.length(); i++) {  // loop through numerals in the input string
            switch (s.charAt(i)) {  // use of switch statements to set roman numeral values, which add onto the sum
                case 'M':
                    sum += 1000;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'I':
                    sum += 1;
                    break;
            }

        }
        // need to account for specific roman numeral cases that don't follow the norm:
        if (s.contains("IV") || s.contains("IX")) {
            sum -= 2;   // previous sum methods would have these as 6 and 11, so we subtract 2
        }
        if (s.contains("XL") || s.contains("XC")) {
            sum -= 20; // previous sum methods would have these as 60 and 110, so we subtract 20
        }
        if (s.contains("CD") || s.contains("CM")) {
            sum -= 200; // previous sum methods would have these as 600 and 1100, so we subtract 200
        }
        return sum;
    }

}
