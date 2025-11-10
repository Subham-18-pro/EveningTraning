import java.util.Scanner;
class power
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int digit=0;
		int sum=0;
		int t=n;
		while(t!=0)
		{
			t=t/10;
			digit++;
		}
		System.out.println("number of digit: z= "+digit);
		t=n;
		while(t!=0)
		{
			int r=t%10;
			sum=sum+(int)Math.pow(r,digit);
			t=t/10;
		}
		if (sum==n)
		{
			System.out.println("the number is amstrong");
		}
		else
		{
			System.out.println("the number is not amstrong");
		}sc.close();
		
	}
}