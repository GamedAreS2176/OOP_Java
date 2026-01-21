class Code8
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int max=0;
		if(a>b && a>c)
		max=a;
		else if(b>a && b>c)
		max=b;
		else
		max=c;
		System.out.println(max);
	}
}
