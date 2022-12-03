// SAME as constant characteristics of class from c++

class Demo
{
    public int No1;
    public final int No2 = 11;      // const int No2;
    public final int No3;       // const int No3;

    public Demo()       // : No2(11), No3(21)
    {
        No1 = 0;
        No3 = 21;       // NA in c++
    }
}


class Final1 
{
    public static void main(String arr[])    
    {
        final int i = 51;       // It is a normal local variable.  // In c++ const int i = 51; 
        Demo obj = new Demo();
        obj.No1++;
    //    obj.No2++;
    //    obj.No3++;
    }
}
