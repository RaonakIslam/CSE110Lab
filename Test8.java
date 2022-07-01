import java.util.Scanner;

public class Test8
{
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
         
         int number1;
         System.out.println("Please enter first number");
         number1 = input.nextInt();
        
         int number2;
         System.out.println("Please enter second number");
         number2 = input.nextInt();
        
         if(number1>number2)
        {
           System.out.println("subtraction= ");
           System.out.println(number1-number2);
        }
         else 
        {
           int sub;
           sub = number2-number1;
           System.out.println("subtraction= "+sub);
        }       
         
      }

}