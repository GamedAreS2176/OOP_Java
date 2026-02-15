class Code9
{
    int age=15;
    void change(int age)
    {
        this.age=age;
    }
    public static void main(String[] args)
    {
        Code9 ob=new Code9();
        ob.change(14);
        System.out.println(ob.age);
    }
}