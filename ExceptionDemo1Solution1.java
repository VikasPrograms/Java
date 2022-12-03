// This is the General Exception or Generic Exception example (any can except exception)

import java.util.*;

class ExceptionDemo1Solution1
{
    public static void main(String a[])
    {

// Null Pointer Exception below

        String s1 = "Marvellous";
        String s2 = null;           // null syntax in java written small letters and NULL syntax in C++ written capital.

        try
        {
            System.out.println("Data of s1 is : "+s1);
            System.out.println("Data of s2 is : "+s2);

            System.out.println("length of s1 is : "+s1.length());
            System.out.println("length of s2 is : "+s2.length());  
        }
        catch(Exception obj)        // General Exception or Generic Exception
        {
            System.out.println("Inside catch 3");
            System.out.println(obj);
        }
        finally                     // finally block is to release the resource
        {
            System.out.println("Inside finally block");
        }


// Arithmetic Exception below

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
        catch(Exception obj)                    // General Exception
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
