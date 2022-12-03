// Null Pointer Exception example

import java.util.*;

class ExceptionDemo3Solution
{
    public static void main(String a[])
    {
        String s1 = "Marvellous";
        String s2 = null;       // null syntax in java written small letters and NULL syntax in C++ written capital.


        try
        {
            System.out.println("Data of s1 is : "+s1);
            System.out.println("Data of s2 is : "+s2);
            System.out.println("length of s1 is : "+s1.length());
            System.out.println("length of s2 is : "+s2.length());  
        }
        catch(ArithmeticException obj)     // Specific Exception  (Arithmetic)
        {
            System.out.println("Inside catch 1");
            System.out.println(obj);
        }
        catch(NullPointerException obj)     // Specific Exception  (NullPointer)
        {
            System.out.println("Inside catch 2");
            System.out.println(obj);
        }
        
        catch(Exception obj)        // General Exception or Generic Exception
        {
            System.out.println("Inside catch 3");
            System.out.println(obj);
        }
        finally     // finally block is to release the resource
        {
            System.out.println("Inside finally block");
        }
    }
}