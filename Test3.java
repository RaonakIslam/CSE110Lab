import java.util.Scanner;

public class Test3
{
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
         
         float number1,number2;
        
         System.out.println("Please enter a number");
         number1 = input.nextFloat();
        
         
         System.out.println("Please enter another number");
         number2 = input.nextFloat();
        
        
         System.out.print("sum=");
         System.out.println(number1+number2);
         
         System.out.print("product= ");
         System.out.println(number1 * number2);
         
         System.out.println("subtraction= ");
         System.out.println(number1-number2);
      }

}