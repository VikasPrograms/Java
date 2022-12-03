import java.util.*;

class ExceptionDemo1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0;
        int iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter first number");
        iNo1 = sobj.nextInt();      //  10
    
        System.out.println("Enter second number");
        iNo2 = sobj.nextInt();      //  0
    
        iAns = iNo1 / iNo2;         //  ArithmeticException 

        System.out.println("Division is : "+iAns);
    }
}
