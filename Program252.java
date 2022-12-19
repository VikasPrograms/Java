// Accept the string for user and Display count the letters.


import java.util.*;

class MarvellousX
{
    public void Display(String s)
    {
        for(int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}

class Program252
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter String : ");
        String str = sobj.nextLine();               // Using String method

        MarvellousX obj = new MarvellousX();
        obj.Display(str);
    }
}