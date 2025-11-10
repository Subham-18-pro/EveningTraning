import java.util.*;
public class oneto100 
{
    public static void main(String []args)
    {  
    System.out.print("Enter the range: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        System.out.println(i);
    }
    sc.close();
    }
    
}
