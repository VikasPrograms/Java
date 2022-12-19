//  Accept the string for user and Display the welcome.


import java.util.*;

class Program249
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your full name : ");
        String str = sobj.nextLine();               // Using String method

        System.out.println("Welcome "+str);
    }
}