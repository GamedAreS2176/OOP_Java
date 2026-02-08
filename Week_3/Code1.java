import java.io.*;
class Code1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.println("Enter A String: ");
        s=br.readLine();
        System.out.println(s);
    }
}