// Arithmetic Exception example

import java.util.*;

class ExceptionDemo1Solution
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter first number");
        iNo1 = sobj.nextInt();                  // 10
    
        System.out.println("Enter second number");
        iNo2 = sobj.nextInt();                  // 0    then display Arithmetic Exception
        
        try
        {
            System.out.println("Inside try block");
            iAns = iNo1 / iNo2;                 // Exception prone code line
            System.out.println("Division is : "+iAns);
        }
        catch(ArithmeticException obj)          // Specific Exception  (Arithmetic)
        {
            System.out.println("Inside catch 1");
            System.out.println(obj);
        }
        catch(NullPointerException obj)         // Specific Exception  (NullPointer)
        {
            System.out.println("Inside catch 2");
            System.out.println(obj);
        }
        
        catch(Exception obj)                    // General Exception or Generic Exception
        {
            System.out.println("Inside catch 3");
            System.out.println(obj);
        }
        finally     // finally block is to release the resource
        {
            System.out.println("Inside finally block");
            sobj.close();
        }
    }
}