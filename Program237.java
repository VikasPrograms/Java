// Display Multiplication of Factors.

import java.util.*;
 
class Numbers
{
    public int FactorsMultiplication(int iNo)
    {
        int iCnt = 0, iMult = 1;
        
        for(iCnt = 1; (iCnt <= iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iMult = iMult * iCnt;
            }
        }
        return iMult;
    }
}

class Program237
{
    public static void main(String arg[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter First Number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        iRet = nobj.FactorsMultiplication(iNo);
        System.out.println("Multiplication of factors of "+ iNo +" is : "+iRet);
    }
}