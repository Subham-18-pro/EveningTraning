import java.util.Scanner;
class pr7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the 1st number: ");
		int a=sc.nextInt();
		System.out.print("enter the 2nd number: ");
		int b=sc.nextInt();
		while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println(a);
		sc.close();
	}
	
}