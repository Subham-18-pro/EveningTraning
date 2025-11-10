import java.util.Scanner;

public class peramidv
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) 
        {
            for (int j = a - 1; j >= i; j--) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a - 1; i >= 1; i--) 
        {
            for (int j = a - 1; j >= i; j--) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }sc.close();
    }
}