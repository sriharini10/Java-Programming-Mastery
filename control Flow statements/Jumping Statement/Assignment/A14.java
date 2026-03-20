class A14
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 20; i++)
        {
            if (i % 2 == 0)
                continue;

            if (i * i > 200)
                break;

            System.out.println(i);
        }
    }
}
