public class NeonNumber 
{
    public static void main(String[] args) 
    {
        System.out.println("Neon numbers from 1 to 1000 are:");
        for (int num = 1; num <= 1000; num++) 
        {
            int square = num * num;
            int sum = 0;
            int temp = square;

            while (temp != 0) 
            {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == num) 
            {
                System.out.println(num);
            }
        }
    }
}