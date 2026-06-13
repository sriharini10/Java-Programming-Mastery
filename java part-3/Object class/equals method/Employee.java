public class Employee{
    String ename;
    int eid;
    double sal;

    Employee(String ename, int eid, double sal) {
        this.ename = ename;
        this.eid = eid;
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj){
        Employee e = (Employee) obj; //Downcasting

        return this.ename.equals(e.ename) && this.eid == e.eid  && this.sal == e.sal; 
    }
    
    

    public static void main(String[] args) {
        Employee e1 = new Employee("miller",101,25000);
        Employee e2 = new Employee("scott",102,30000);
        Employee e3 = new Employee("miller",101,25000);


        //checking with == operator
        System.err.println(e1==e2);
        System.err.println(e1==e3);

        System.err.println("------------------------------");

        //checking with equals operator
        System.err.println(e1.equals(e2));
        System.err.println(e1.equals(e3));
    }

    

    
}