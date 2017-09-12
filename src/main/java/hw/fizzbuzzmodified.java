import java.util.Scanner;
public class fizzbuzzmodified
{
  
    public static void main(String args[])
    {
    
        int x;
        x = Integer.parseInt(args[0]);
		String returnedarray[] = new String[x];
		returnedarray = fizzbuzzArray(x);
        for(int j = 0; j < returnedarray.length; j++)
        {
			System.out.println(returnedarray[j]);
            
        }
        
       
     }
       public static String[] fizzbuzzArray(final int x)
    {
        String arry[] = new String[x];
        for(int j = 0; j < x; j++)
		{
			if(((j + 1 % 5) == 0) && ((j + 1 % 3) == 0))
			{
				arry[j] = "Fizzbuzz";
				
			}
			else if(((j + 1) % 3) == 0)
			{
				arry[j] = "Fizz";
			
				
			}
			else if(((j + 1) % 5) == 0)
			{
			    arry[j] = "buzz";
			   
				
			}
			else
			{
			
			    arry[j] = Integer.toString(j + 1);
			}
		
		}
		
		return arry;
       
    }
}
    
