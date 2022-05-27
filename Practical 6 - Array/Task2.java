import java.util.Scanner;

class Task2 {
   public static void main (String[] args) {
      Scanner sc = new Scanner (System.in);
      
      String[] name = {"Sulaiman", "Dadu", "Musa", "Yusof", "Muhammad"};
      
      int[] age = {180, 70, 123, 110, 63};
      
      int oldest = age[0];
      
      String nameold = name[0];
      
      for (int i = 1; i < name.length; i++) {
         if (age[i] > oldest) {
            oldest = age[i];
            nameold = name[i];
         }
      }
      
      System.out.print("The eldest is: " + nameold + ", " + oldest);
   }
}