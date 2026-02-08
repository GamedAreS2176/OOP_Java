import java.io.*;
class Code5
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,f=0;
        System.out.println("Enter A Number: ");
        n=Integer.parseInt(br.readLine());
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            f=1;
        }
        if(f==0)
        System.out.println("Prime Number");
        else
        System.out.println("Not Prime Number");
    }
}