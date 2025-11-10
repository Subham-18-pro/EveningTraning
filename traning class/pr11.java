import java.util.Scanner;
class pr11
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		char s=sc.next().charAt(0);
		if("aeiouAEIOU".indexOf(s)!=-1)
			{
				System.out.println("vowle");
			}
			else{
				System.out.println("consonant");
			}sc.close();
	}
}