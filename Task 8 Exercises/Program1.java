import java.util.Scanner;

class Program1 {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
   
      System.out.print("Please enter 10 marks: ");
   
      double[] marks = new double[10];
   
      for (int i = 0; i != 10; i++) {
         double mark = sc.nextDouble();
         marks[i] = mark;
      }
      
      System.out.println(highestMark(marks));
   }
   
   static double highestMark (double[] marks) {
      double highest_mark = Double.NEGATIVE_INFINITY;
      
      for (int i = 0; i < marks.length; i++) {
         if (marks[i] > highest_mark) highest_mark = marks[i];
         continue;
      }
      
      return highest_mark;
   }
}