// Pattern Printing

/*
    Input = 1234 
    Output = 

    4   3   2   1    
 */

 import java.util.*;

 class Pattern
 {
     public void Display(int iNo)
     {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit+"\t");
            iNo = iNo / 10;
        }
        System.out.println();
     }
 }
 
 
 class Program277
 {
     public static void main(String a[])    
     {
         Pattern pobj = new Pattern();
         Scanner sobj = new Scanner(System.in);
 
         System.out.println("Enter String : ");
         int s = sobj.nextInt();

         pobj.Display(s);
     }
 }