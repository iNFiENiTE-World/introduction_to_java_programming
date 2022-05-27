import java.util.Scanner;

class Program2 {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String[] names = new String[10];
      
      double[] marks = new double[10];
      
      for (int i = 0; i != 10; i++) {
         
         System.out.print("Name: ");
         String name = sc.next();
         
         System.out.print("Mark: ");
         double mark = sc.nextDouble();
         
         names[i] = name;
         marks[i] = mark;
      }
      
      int index = highestMarkIndex(marks);
      
      System.out.println("Name: " + names[index] + " | Mark: " + marks[index]);
   }
   
   static int highestMarkIndex (double[] marks) {
      double highest_mark = Double.NEGATIVE_INFINITY;
      int index = 0;
      
      for (int i = 0; i < marks.length; i++) {
      
         if (marks[i] > highest_mark) {
            highest_mark = marks[i];
            index = i;
         }
         
         continue;
      }
      
      return index;
   }
}