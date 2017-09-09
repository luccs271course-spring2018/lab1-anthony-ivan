package hw;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  int n;

  public static void main(final String[] args) {
    
          Scanner keyboard = new Scanner(System.in);
		System.out.println("enter n integer and i'll calculate which ones a fizz and which ones a buzz!");
		int n = keyboard.nextInt();
		for(int i = 0; i < n; i++)
		{
			if(i % 5 == 0 && i % 3 == 0)
			{
				System.out.println("FizzBuzz");
			}
			else if(i % 3 == 0)
			{
				System.out.println("Fizz");
				
			}
			else if(i % 5 == 0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
  }
}

	
