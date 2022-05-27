class Task3 {
   public static void main (String[] args) {
      double[] marks = {97.5, 75.3, 53.1, 86.4, 64.2, 13.5, 35.7, 57.9, 24.6, 46.8};
      
      double sum = 0;
      
      for (int i = 0; i < marks.length; i++) {
         System.out.print(marks[i] + "\t");
         sum = sum + marks[i];
      }
      
      System.out.print("\nSum: " + sum);
   }  
}  