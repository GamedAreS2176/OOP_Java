class Code5
{
	public static void main(String[] args)
	{
		Fact ob=new Fact();
		int n=5;
		System.out.println(ob.fact(5));
	}
}
class Fact
{
	int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
}
		
		
