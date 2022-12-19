// Accept the string for user and Display count the Digits.


import java.util.*;

class MarvellousX
{
    public int DigitCount(String s)
    {
        int iCnt = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) >= '0') && (s.charAt(i) <= '9'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program255
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter String : ");
        String str = sobj.nextLine();               // Using String method

        MarvellousX obj = new MarvellousX();
        
        int iRet = obj.DigitCount(str);
        System.out.println("Number of Digit case letters are : "+iRet);
    }
}