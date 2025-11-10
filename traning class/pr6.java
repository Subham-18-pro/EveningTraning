//even sum of fibonacci series till N
public class pr6
{
    public static void main(String[] args)
    {
		int n=10;
		int a=0;
		int b=1;
		int temp=0;
		int sum =0;
		System.out.print(a+" "+b);
		while(true)
		{
			temp=a+b;
		if(temp%2==0)
			sum=sum+temp;
		if(temp>n)
			break;
			a=b;
			b=temp;
			System.out.print(" "+temp);
		}
		
    }
}	