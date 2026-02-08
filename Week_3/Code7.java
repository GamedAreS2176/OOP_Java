import java.io.*;
class Code7
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Number: ");
        int n=Integer.parseInt(br.readLine());
        int m=n,c=0;
        while(m>0)
        {
            c++;
            m=m/10;
        }
        m=n;
        int s=0;
        while(m>0)
        {
            s+=Math.pow(m%10,c);
            m=m/10;
        }
        if(s==n)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not Armstrong Number");
    }
}