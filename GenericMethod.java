
class GenericMethod 
{
    public static <T> void Display(T Arr[])
    {
        for(int i = 0; i < Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }
    public static void main(String arg[])    
    {
        Integer iArr[] = {10,20,30,40};      // Integer is a Wrapper class
        Display(iArr);

        Character cArr[] = {'a','b','c','d'};
        Display(cArr);

        Float fArr[] = {10.0f,25.6f,85.63f,33.4f};
        Display(fArr);

        Double dArr[] = {10.0,25.6,85.63,33.4};
        Display(dArr);
    }
}