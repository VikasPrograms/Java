// Display Even Factors.
// line 12 change

import java.util.*;
 
class Numbers
{
    public void EvenFactorsDisplay(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 2; iCnt <= (iNo/2); iCnt+=2)     // iCnt = iCnt + 2
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println("Even Factor is : "+iCnt);
            }
        }
    }
}

class Program235
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter Number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.EvenFactorsDisplay(iNo);
    }
}