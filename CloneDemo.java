package Toaday;

class Employee implements Cloneable
{
    public int Eid;
    public String Name;
    public int Salary;

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public Employee(int No, string str, int Value)
    {
        this.Eid = No;
        this.Name = str;
        this.Salary = Value;
    }
}

class CloneDemo 
{
    public static void main(String A[])
    {
        try
        {
            Employee eobj1 = new Employee(101,"Rahul",11000);
            Employee eobj2 = (Employee)eobj1.clone();

            System.out.println("Name of first employee : "+eobj1.Name);
            System.out.println("Name of Second employee : "+eobj2.Name);

            System.out.println("Salary of first employee : "+eobj1.Salary);
            System.out.println("Salary of second employee : "+eobj2.Salary);

            eobj1.Name = "Sagar";

            System.out.println("Name of first employee : "+eobj1.Name);
            System.out.println("Name of Second employee : "+eobj2.Name);
        }
    
        catch(CloneNotSupportedException obj)
        {}
    }
}
