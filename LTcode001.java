public class LTcode001{
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // Reverse the number
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Compare the reversed number with the original
        return original == reversed;
    }

    public static void main(String[] args) {
        LTcode001 ltcode001= new LTcode001();

        // Test cases
        System.out.println("Is 121 a palindrome? " + ltcode001.isPalindrome(121)); // true
        System.out.println("Is -121 a palindrome? " + ltcode001.isPalindrome(-121)); // false
        System.out.println("Is 10 a palindrome? " + ltcode001.isPalindrome(10)); // false
        System.out.println("Is 0 a palindrome? " + ltcode001.isPalindrome(0)); // true
    }
}