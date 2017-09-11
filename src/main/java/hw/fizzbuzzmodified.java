import java.util.Scanner;
public class fizzbuzzmodified
{

  
    public static void main(String[] args)
    {
        int x;
        for(int i = 0; i < args.length; i++)
        {
            x = i;
        }
        fizzbuzzArray(x);
     }
       public static String[] fizzbuzzArray(final int n)
    {
        if(n > 5)
        {
            System.out.println("Yay"); 
        }
        else
        {
            System.out.println("Nay");
        }
    }
    
}