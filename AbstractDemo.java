// abstract class is a class which contains 0 or more abstract method in it
// abstract class achives 0 to 100% abstraction.

abstract class Arithematic
{
    public int Addition(int No1, int No2)
    {
        return No1 + No2;
    }
    public abstract int Substraction(int No1, int No2);
    // Virtual int Substraction(int No1, int No2) = 0;
}

class Marvellous extends Arithematic
{
    public int Substraction(int iNo1, int iNo2)
    {
        return No1 - No2;
    }
}

class AbstractDemo 
{
    public static void main(String arr[])    
    {
        // Arithematic aobj = new Arithematic();        // NA
        Arithematic aobj = new Marvellous();        // Allowed
        
        Marvellous mobj = new Marvellous();
        int Ret = 0;
        Ret = mobj.Addition(11,10);
        System.out.println("Additiobn is : "+Ret);
        Ret = mobj.Substraction(11,10);
        System.out.println("Substraction is : "+Ret);
    }
}
