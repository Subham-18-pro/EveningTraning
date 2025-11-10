
public class pr5
{
    public static void main(String[] args)
    {
    int a=4;
    int b=7;
	int max;
	int lcm;
	if(a>b)
	{
		max=a;
	}
	else{
		max =b;
	}
	while(true)
	{
		if(max%a==0 && max%b==0)
		{
			lcm=max;
			break;
		}
		max++;
	}
		System.out.println(lcm);
    }
}