public class Ltcode003 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1, index = 0, result = 0;
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = (s.charAt(index++) == '-') ? -1 : 1;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index++) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        Ltcode003 solution = new Ltcode003();
        
        // Test cases
        System.out.println(solution.myAtoi("42"));         // Output: 42
        System.out.println(solution.myAtoi(" -042"));      // Output: -42
        System.out.println(solution.myAtoi("1337c0d3"));   // Output: 1337
        System.out.println(solution.myAtoi("0-1"));        // Output: 0
        System.out.println(solution.myAtoi("words and 987")); // Output: 0
    }
}