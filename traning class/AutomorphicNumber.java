public class AutomorphicNumber 
{
    public static void main(String[] args) 
    {
        System.out.println("Automorphic numbers from 1 to 1000 are:");
        for (int i = 1; i <= 1000; i++) 
        {
            int square = i * i;
            int temp = i;
            int digits = 0;
            while (temp > 0) 
            {
                digits++;
                temp /= 10;
            }
            int lastDigits = square % (int)Math.pow(10, digits);
            if (lastDigits == i) 
            {
                System.out.println(i);
            }
        }
    }
}