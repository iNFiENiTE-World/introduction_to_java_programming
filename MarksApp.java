import java.util.Scanner;

class MarksApp { 
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter three marks: ");
      double mark1 = sc.nextDouble();
      double mark2 = sc.nextDouble();
      double mark3 = sc.nextDouble();
      
      double avg = (mark1 + mark2 + mark3) / 3;
      System.out.println("Average is " + avg);
      
      if (avg > 40)
         System.out.println("\nPASS");
      else
         System.out.println("\nFAIL");
         
   }
}