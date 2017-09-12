import java.util.*;

public class FizzbuzzP4 {

  public static void main(String[] args)
  {
    int limit = Integer.parseInt(args[0]);
    if(args.length == 1 && limit > 0) {
        List<String> list = new ArrayList<String>();
        list = fizzBuzzList(limit);
        for(int i = 0; i < limit; i++){
          System.out.println(list.get(i));
        }
    }
    else {
        System.out.println("Invalid arguments");
    }
    
  }
  
  public static List<String> fizzBuzzList(final int n){
    List<String> ret = new ArrayList<String>();
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
            ret.add(Integer.toString(i));
          }
          else {
            ret.add(output);
          }
        }
    return ret;    
  }
}