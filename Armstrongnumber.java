package example;

public class Armstrongnumber {
    public static void main(String[] args)
    {
        int a=153;
        int len=order(a);
        while(a)
        static int order(int x)
        {
            int len=0;
            while(x!=0)
            {
                x/=x;
                len++;           
            }
            return len;
        }
    }
    
}
