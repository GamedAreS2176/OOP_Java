class Code2
{
    Code2(int a)
    {
        System.out.println(a*a);
    }
    Code2(double a)
    {
        System.out.println(a*a);
    }
    public static void main(String[] args)
    {
        new Code2(2);
        new Code2(2.0);
    }
}