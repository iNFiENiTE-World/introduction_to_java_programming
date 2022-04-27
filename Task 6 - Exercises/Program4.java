import java.util.Scanner;

class Program4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Please enter 7 marks: ");
      
      double total = 0;
      
      // Take 7 marks
      for (int i = 0; i != 7; i++) {
         // Get mark
         double mark = sc.nextDouble();
         
         // Total mark
         total += mark;
      }
      
      // Caclculate average
      double average = total / 7;
      
      String status = "PASS";
      
      // Check if average should fail
      if (average < 40) {
         status = "FAIL";
      }
      
      System.out.println(status);
      
   }
}