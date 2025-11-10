import java.util.Scanner;

public class DisariumNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp > 0) 
        {
            count++;
            temp /= 10;
        }
        int sum = 0;
        temp = num;
        int pos = count;
        while (temp > 0) 
        {
            int digit = temp % 10;
            sum += Math.pow(digit, pos);
            temp /= 10;
            pos--;
        }
        if (sum == num) 
        {
            System.out.println(num + " is a Disarium number.");
        } else 
        {
            System.out.println(num + " is not a Disarium number.");
        }
    }
}