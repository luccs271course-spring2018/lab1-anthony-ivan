package hw;

import java.util.Arrays;

public class Main {

  public static void main(String[] args)
  {
    for(int i = 1; i <= 100; i++)
    {
      String output = "";
      if(i % 3 == 0) {
        output += "Fizz";
      }
      if(i % 5 == 0) {
        output += "Buzz";
      }
      if(output == "") {
        System.out.println(i);
      }
      else {
        System.out.println(output);
      }
    }
  }
}
