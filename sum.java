import java.util.Scanner;

public class sum
{
   public static void main(String[] args)
   {
      int i, num, sum=0;
      try (Scanner scan = new Scanner(System.in)) {
         
          System.out.print("Enter 5 Numbers: ");
          for(i=0; i<5; i++)
          {
             num = scan.nextInt();
             sum = sum + num;
          }
    }
      
      System.out.println("\nSum = " +sum);
   }
}
