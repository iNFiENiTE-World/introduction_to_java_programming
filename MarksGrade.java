import java.util.Scanner;

class MarksGrade {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      
      char grade = 'Z';
      
      System.out.print("Enter a mark (0 - 100): ");
      double mark = sc.nextDouble();
      
      if(mark >= 80 && mark <= 100)
         grade = 'A';
      else if (mark >= 60 && mark <= 80)
         grade = 'B';
      else if (mark >= 50 && mark <= 60)
         grade = 'C';      
      else if (mark >= 40 && mark <= 50)
         grade = 'D';   
      else if (mark >= 0 && mark <= 40)
         grade = 'F';
      else
         System.out.println ("Mark not in range.");
         
      System.out.println("Grade: " + grade);
   }
}