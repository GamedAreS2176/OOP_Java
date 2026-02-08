import java.io.*;
class Code6
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Binary and Decimal Number: ");
        int bn=Integer.parseInt(br.readLine());
        int dn=Integer.parseInt(br.readLine());
        int t=bn,c=0,s=0;
        //Binary to decimal
        while(t!=0)
        {
            if(t%10==1)
            s+=Math.pow(2,c);
            t=t/10;
            c++;
        }

        //decimal to binary
        String bin="";
        c=dn;
        while(c!=0)
        {
            bin=(c%2)+bin;
            c=c/2;
        }
        
        System.out.println("Decimal: "+s);
        System.out.println("Binary: "+bin);
    }
}