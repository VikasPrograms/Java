// Display Addition of two numbers.
// This syntax prefere.

import java.util.*;

class Arithematic
{
    public int iValue1;         // Characteristics
    public int iValue2;         // Characteristics

    public Arithematic(int i, int j)        // Parametrised constructor
    {
        iValue1 = i;
        iValue2 = j;
    }

    public int Addition()      // Behaviour
    {
        int iSum = 0;
        iSum = iValue1 + iValue2;
        return iSum;
    }
}

class Program232
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter First number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        iNo2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(iNo1, iNo2);
        iAns = aobj.Addition();

        System.out.println("Addition is : "+iAns);
    }
}