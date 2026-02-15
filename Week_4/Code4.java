class Code4
{
    Code4()
    {
        System.out.println("hey there");
    }
    Code4(int age)
    {
        this();
        System.out.println("Used this keyword and this variable: "+age);
    }
    public static void main(String[] args)
    {
        new Code4(7);
    }
}