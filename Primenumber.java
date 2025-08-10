package example;

public class Primenumber {
    public static void main(String[] args)
    {
        int n=7;
    boolean prime=true;
    if(n<=1)
    {
        prime=false;
    }
    else
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                prime=false;
                break;
            }
        }
    }
    if(prime)
    {
        System.out.println("It is prime number");
    }
    else
    {
        System.out.println("It is not a prime number");
    }
    }
    
}
