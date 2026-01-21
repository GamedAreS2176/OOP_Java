class Code13
{
	public static void main(String[] args)
	{
		Fact ob=new Fact();
		System.out.println("Hello User");
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int sum=a+b;
		System.out.println(sum);
		
		System.out.println(ob.fact(sum));
	}
}
class Fact
{
	int fact(int x)
	{
		int f=1;
		for(int i=1;i<=x;i++)
		{
			f=f*i;
		}
		return f;
	}
}
