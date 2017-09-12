public class FizzbuzzP3 {

  public static void main(String[] args)
  {
    int limit = Integer.parseInt(args[0]);
    if(args.length == 1 && limit > 0) {
        String[] printable = new String[limit];
        printable = fizzBuzzArray(limit);
        for(int i = 0; i < limit; i++){
          System.out.println(printable[i]);
        }
    }
    else {
        System.out.println("Invalid arguments");
    }
    
  }
  
  public static String[] fizzBuzzArray(final int n){
    String[] ret = new String[n];
    for(int i = 1; i <= n; i++)
        {
          String output = "";
          if(i % 3 == 0) {
            output += "Fizz";
          }
          if(i % 5 == 0) {
            output += "Buzz";
          }
          if(output == "") {
            ret[i-1] = (Integer.toString(i));
          }
          else {
            ret[i-1] = output;
          }
        }
    return ret;    
  }
}