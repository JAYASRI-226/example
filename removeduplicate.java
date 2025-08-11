package example;

public class removeduplicate {
    public static void main(String[] args) {
        int a[]={1,1,2,3,3};
        int stack[]=new int[a.length];
        int top=-1;
        for(int i=0;i<a.length;i++)
        {
            int data=check(i);
        }
        static void push(int x)
        {
                top++;
                stack[top]=x;
            
        }
        static int check(x);
        {
            for(int i=0;i<stack.length;i++)
            {
                if(a[x]==stack[i])
                {
                    break;
                }
            }
            
        }
        
    }
    
    
}
