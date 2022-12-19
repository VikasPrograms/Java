// Accept N number of user and perform the addition of N numbers.
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

    public int Addition()
    {
        int iSum = 0;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
}

class Program244
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array that your want to allocate");
        int iSize = sobj.nextInt();
        
        MarvellousX obj = new MarvellousX(iSize);

        obj.Accept();
        obj.Display();

        int iRet = obj.Addition();
        System.out.println("Addition of all elements is : "+iRet);
    }
}