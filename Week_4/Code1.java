class Code1
{
    public static void main(String[] args)
    {
        Code1 ob=new Code1();
        System.out.println(ob.add(1,2,3));
        System.out.println(ob.add(1,2));
        System.out.println(ob.sqr(2));
        System.out.println(ob.sqr(2.0));
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    int add(int a,int b)
    {
        return a+b;
    }
    int sqr(int a)
    {
        return a*a;
    }
    double sqr(double a)
    {
        return a*a;
    }
}