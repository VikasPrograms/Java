// Accept N number of user and reverse the array.
// protected class

import java.util.*;

class ArrayX
{
    protected int Arr[];        // only this class use

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    protected void Accept()       // Getter  // only this class use
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter "+Arr.length+"elements ");;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the element no : "+(iCnt + 1));
            Arr[iCnt] = sobj.nextInt();
        }
    }

    protected void Display()     // Setter   // only this class use
    {
        System.out.println("Elements of array are : ");
        
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }
        System.out.println();
    }
}

class MarvellousX extends ArrayX
{
    public MarvellousX(int iSize)
    {
        super(iSize);
    }

    public void Reverse()
    {
        int iStart = 0;
        int iEnd = Arr.length - 1;
        int iTemp = 0;

        while(iStart < iEnd)
        {
            iTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = iTemp;

            iStart++;
            iEnd--;
        }
    }
}

class Program247
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array that your want to allocate");
        int iSize = sobj.nextInt();
        
        MarvellousX obj = new MarvellousX(iSize);

        obj.Accept();
        obj.Display();

        obj.Reverse();
        System.out.println("Array after reverse operation : ");

        obj.Display();
    }
}