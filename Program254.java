// Accept the string for user and Display count the Capital letters.


import java.util.*;

class MarvellousX
{
    public int CapitalCount(String s)
    {
        int iCnt = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program254
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter String : ");
        String str = sobj.nextLine();               // Using String method

        MarvellousX obj = new MarvellousX();
        
        int iRet = obj.CapitalCount(str);
        System.out.println("Number of capital case letters are : "+iRet);
    }
}