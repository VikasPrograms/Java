// Accept the string for user and Display count the Number of characters.


import java.util.*;

class Program250
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your full name : ");
        String str = sobj.nextLine();               // Using String method

        System.out.println("Number of characters are : "+str.length());
    }
}