import java.util.Scanner;
class pr8
{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
				if(flag==0)
				{
					System.out.println(i);
					sum=sum+i;
				}
		}
		System.out.println(sum);
		sc.close();
	}
}