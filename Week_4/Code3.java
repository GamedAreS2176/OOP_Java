class Code3
{
    void display()
    {
        System.out.println("hello");
    }
    void invoke()
    {
        this.display();
    }
    public static void main(String[] args)
    {
        Code3 ob=new Code3();
        ob.invoke();
    }
}