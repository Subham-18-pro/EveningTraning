import java.util.Scanner;
class pr9
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int  year=sc.nextInt();
		if(year%400==0||(year%4==0&&year%100!=0))
		{
			System.out.println("IT IS A LEEAP YEAR");
		}
		else
		{
			System.out.println("IT IS NOT A LEEAP YEAR");
		}
		sc.close();
	}
}