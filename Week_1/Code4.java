class Code4
{
	public static void main(String[] args)
	{
		Code4 ob=new Code4();
		int n=5;
		System.out.println(ob.fact(5));
	}
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
