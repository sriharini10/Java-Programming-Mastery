class Emp
{
    String ename;
    int eid;
    double sal;
    String loc;

    Emp(String ename, int eid, double sal, String loc)
    {
        this.ename = ename;
        this.eid =eid;
        this.sal = sal;
        this.loc = loc;
    }
    @Override
    public String toString()
    {
        return "\nename is " +ename +"\neid is "+eid + "\nsalary is " +sal +"\nlocation is " +loc;
    }
}
class Office
{
    public static void main(String args[])
    {
        Emp e1 = new Emp("miller",101,30000,"Chennai");
        Emp e2 = new Emp("Scott",120,50000,"Mumbai");
        System.out.println(e1);
        System.out.println(e1.toString());
        System.out.println(e2);
        System.out.println(e2.toString());
    }
}