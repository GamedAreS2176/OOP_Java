class Code5
{
	public static void main(String[] args)
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int s=0;
		for(int i=0;i<3;i++)
		{
			if(i!=2-i)
			s+=arr[i][i]+arr[i][2-i];
			else
			s+=arr[i][i];
		}
		System.out.println(s);
	}
}
