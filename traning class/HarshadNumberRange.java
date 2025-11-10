public class HarshadNumberRange {
    public static void main(String[] args) {
        System.out.println("Harshad numbers from 1 to 1000 are:");
        for (int num = 1; num <= 1000; num++) {
            int sum = 0;
            int temp = num;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum != 0 && num % sum == 0) {
                System.out.println(num);
            }
        }
    }
}