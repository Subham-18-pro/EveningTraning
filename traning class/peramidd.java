import java.util.Scanner;

public class peramidd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = a; i >= 1; i--) 
        {
            for (int j = a; j > i; j--) 
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