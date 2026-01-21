class Code10
{
	void change(Val v)
	{
		v.val=10;
	}
	public static void main(String[] args)
	{	
		Code10 obj=new Code10();
		Val ob=new Val();
		ob.val=5;
		obj.change(ob);
		System.out.println(ob.val);
		System.out.println(obj.sum(5,5));
	}
	int sum(int a,int b)
	{	
		return a+b;
	}
}
class Val
{
	int val;
}
