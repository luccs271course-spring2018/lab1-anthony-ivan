public class FizzbuzzP2 {

  public static void main(String[] args)
  {
    int limit = -1;
    if(args.length == 1) {
        limit = Integer.parseInt(args[0]);
    }
    else {
        System.out.println("Invalid arguments");
    }
    if(limit > 0) {
        for(int i = 1; i <= limit; i++)
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
    else  {
        System.out.println("Integer must be greater than 0");
    }
  }
}