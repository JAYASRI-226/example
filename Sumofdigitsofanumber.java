package example;

public class Sumofdigitsofanumber {
    public static void main(String[] args)
    {
        int a=234,sum=0;
    while(a>0)
    {
        int rem=a%10;
        sum+=rem;
        a/=10;
    }
    System.out.println(sum);
    
    }
    
}
