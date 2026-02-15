class Code6
{
    Code6()
    {
        display(this);
    }
    void display(Code6 ob)
    {
        System.out.println("Got an object of current class");
    }
    public static void main(String[] args)
    {
        new Code6();
    }
}