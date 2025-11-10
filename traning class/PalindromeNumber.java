public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers from 1 to 1000 are:");
        for (int num = 1; num <= 1000; num++) {
            int originalNum = num;
            int reversed = 0;
            int temp = num;

            while (temp != 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            if (originalNum == reversed) {
                System.out.println(originalNum);
            }
        }
    }
}