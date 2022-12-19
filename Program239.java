// Display Armstrong Numbers.

import java.util.*;
 
class Digits
{
    public boolean CheckArmstrong(int iNo)
    {
        int iDigitCount = 0;
        int iTemp = iNo;

        while(iTemp != 0)
        {
            iDigitCount++;
            iTemp = iTemp / 10;
        }
//-------------------------------------------------------
        iTemp = iNo;
        int iDigit = 0, iCnt = 0, iSum = 0;
        int iPower = 1;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;

            for(iCnt = 1; iCnt <= iDigitCount; iCnt++)      // Logic to calculate the power.
            {
                iPower = iPower * iDigit;
            }
            iSum = iSum + iPower;
            iPower = 1;         // **********

            iTemp = iTemp / 10;
        }
//-------------------------------------------------------
        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program239
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter First Number : ");
        int iNo = sobj.nextInt();

        Digits nobj = new Digits();

        boolean bRet = nobj.CheckArmstrong(iNo);
        if(bRet == true)
        {
            System.out.println(iNo+ " is a Armstrong number.");
        }
        else
        {
            System.out.println(iNo+ " is Not a Armstrong number.");
        }
    }
}