import java.util.Scanner;

public class AutomorphicNumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;
        int temp = num;
        int digits = 0;
        while (temp > 0){
            digits++;
            temp /= 10;
        }
        int lastDigits = square % (int)Math.pow(10, digits);

        if (lastDigits == num) {

            System.out.println(num + " is an Automorphic number.");
        } else{

            System.out.println(num + " is not an Automorphic number.");
        }
        sc.close();
    }
}