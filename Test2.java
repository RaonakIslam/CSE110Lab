import java.util.Scanner;

public class Test2
{
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
         
         int number1,number2;
        
         System.out.println("Please enter a number");
         number1 = input.nextInt();
        
        
         System.out.println("Please enter another number");
         number2 = input.nextInt();
        
      
         
         System.out.println("sum= ");
        System.out.println(number1+number2);
         
        
        
         System.out.println(number1 * number2);
        
         System.out.println("subtraction= ");
          System.out.println(number1-number2);
      }

}