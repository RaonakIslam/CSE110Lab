import java.util.Scanner;

public class Test6
{
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
         
         
         System.out.println("Please enter first number");
         int number1 = input.nextInt();
        
         
         System.out.println("Please enter second number");
         int number2 = input.nextInt();
        
         if(number1>number2)
        {
           System.out.println("first is greater");
        }
         else
        {
           System.out.println("first is not greater greater");
        }
         
      }

}