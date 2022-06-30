import java.util.Scanner;

public class Test
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
           System.out.println("first is greater");
        }
         else if(number1<number2)
        {
           System.out.println("second is greater");
        }
         else
        {
           System.out.println("the numbers are equal");
        }
         
      }

}