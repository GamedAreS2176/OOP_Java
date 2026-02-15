class Code5
{
    void display(Code5 c)
    {
        System.out.println("Displaying something");
    }
    void show()
    {
        display(this);
    }
    public static void main(String[] args)
    {
        Code5 ob=new Code5();
        ob.show();
    }
}