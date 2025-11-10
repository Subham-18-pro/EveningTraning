import java.util.Scanner;

public class DisariumNumberRange
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter end of range: ");
        int a= sc.nextInt();
        int start = 0;
        System.out.println("Disarium numbers in the range 0 to " + a+ ":");
        for (int b = start; b <=a; b++) {
            if (isDisarium(b)) {
                System.out.println(b);
            }
        }
        sc.close();
    }

    static boolean isDisarium(int b) {
        int count = Integer.toString(b).length();
        int sum = 0, temp = b;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
            count--;
        }
        return sum ==b;
    }
}