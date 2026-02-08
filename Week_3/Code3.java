import java.util.*;
class Code3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter A Number: ");
        n=sc.nextInt();
        int m=n,rev=0;
        while(m!=0)
        {
            rev=rev*10+m%10;
            m=m/10;
        }
        System.out.println(rev);
    }
}