import java.util.Scanner;

class Task1 {
   public static void main (String[] args) {
      Scanner sc = new Scanner (System.in);
      String[] name = new String[7];
      int[] age = new int[7];
      
      for (int i = 0; i < name.length; i++) {
         System.out.print("Enter name and marks: ");
         name[i] = sc.next();
         age[i] = sc.nextInt();
      }

      for (int i = 0; i < name.length; i++) {
         System.out.println("Name: " + name[i] + ", age: " + age[i]);
      }
   }
}