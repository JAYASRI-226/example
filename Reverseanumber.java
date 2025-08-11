package example;

public class Reverseanumber {
    public static void main(String[] args)
    {
        int n=879,rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println(rev);
    }
}
