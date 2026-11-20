class Solution {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int i = 0;
        int n = s.length();

        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Check if we reached the end of the string
        if (i == n) {
            return 0;
        }

        // 2. Determine the sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits and handle integer overflow
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow before multiplying by 10
            // Integer.MAX_VALUE is 2147483647
            if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
