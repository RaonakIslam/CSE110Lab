
import java.util.Scanner;

public class Test4
{
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
         
         
         System.out.println("Please enter radious of a circle");
         int r = input.nextInt();
          
         System.out.println("area =");
         System.out.println(Math.PI*r*r);
         
         System.out.println("circumference =");
         System.out.println(2*Math.PI*r);
      }
      
}