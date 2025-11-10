import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.print("Armstrong numbers from 1 to ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int a = 1; a <= n; a++) {
            int b = a;
            int c = 0;
            int digits = 0;
            int t = a;
            while (t != 0) {
                digits++;
                t =t/ 10;
            }
            t = a;
            while (t != 0) {
                int digit = t % 10;
                c += Math.pow(digit, digits);
                t =t/ 10;
            }

            if (c == b) {
                System.out.println(b);
            }
        }sc.close();
    }
}