class Code11
{	
	public static void main(String[] args)
	{
		int marks[]=new int[5];
		int s=0;
		for(int i=0;i<marks.length;i++)
		{	
			marks[i]=Integer.parseInt(args[i]);
			s+=marks[i];
			if(marks[i]>=90)
			System.out.println(marks[i]+" Grade A");
			else if(marks[i]>=80)
			System.out.println(marks[i]+" Grade B");
			else if(marks[i]>=70)
			System.out.println(marks[i]+" Grade C");
			else if(marks[i]>=60)
			System.out.println(marks[i]+" Grade D");
			else if(marks[i]>=40)
			System.out.println(marks[i]+" Grade E");
			else
			System.out.println(marks[i]+" Grade F");
		}
		int max=marks[0],min=marks[0];
		for(int i=1;i<marks.length;i++)
		{
			if(marks[i]>max)
			max=marks[i];
			else if(marks[i]<max)
			min=marks[i];
		}
		System.out.println("Total Marks of Students: "+s);
		System.out.println("Average Marks of Students: "+(s/marks.length));
		System.out.println("Highest Marks: "+max);
		System.out.println("Lowest Marks: "+min);
	}
}
		
		
		
		
