class Code8
{
    Code8 display()
    {
        return this;
    }
    public static void main(String args[])
    {
        Code8 ob=new Code8();
        if(ob==ob.display())
        System.out.println("it works");
        else
        System.out.println("nvm it doesnt");
    }
}