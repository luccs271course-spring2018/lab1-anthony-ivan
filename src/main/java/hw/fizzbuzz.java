import java.util.Arrays;


public class fizzbuzz{
  

  public static void main(final String[] args) {
    
         int j = Integer.parseInt(args[0]); 
	
		for(int i = 0; i < j; i++)
		{
			int k = i + 1;
			if(((k % 3) == 0) && ((k % 5) == 0))
			{
				System.out.println("Fizzbuzz");
				
			}
			else if(((i + 1) % 3) == 0)
			{
				System.out.println("Fizz");
			
				
			}
			else if(((i + 1) % 5) == 0)
			{
			    System.out.println("buzz");
			   
				
			}
			else
			{
			
			    System.out.println(i + 1);
			}
		}
  }
}

	
