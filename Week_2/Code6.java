class Code6
{
	public static void main(String[] args)
	{
		int arr1[][]={{1,2},{3,4}};
		int arr2[][]={{5,6},{7,8}};
		int arr[][]=new int[2][2];
		for(int i=0;i<arr1.length;i++)
		{	
			for(int j=0;j<arr1.length;j++)
			{	
				for(int k=0;k<arr1.length;k++)
				{
					arr[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		
