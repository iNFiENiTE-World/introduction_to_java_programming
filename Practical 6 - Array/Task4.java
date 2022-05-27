// Linear search
class Task4 {
   public static void main (String[] args) {
      int search = 30, array[] = {10, 20, 30, 40, 50, 60, 70};
      
      for (int i = 0; i < array.length; i++) {
         if (search == array[i]) {
            System.out.println(search + " is present at index " + i);
         }
      }
   }
}  