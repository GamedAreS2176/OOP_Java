class Code10
{
	public static void main(String[] args)
	{
		int y=Integer.parseInt(args[0]);
		if(y%400==0 || (y%4==0 && y%100!=0))
		System.out.println("Leap Year");
		else
		System.out.println("Not Leap Year");
	}
}
