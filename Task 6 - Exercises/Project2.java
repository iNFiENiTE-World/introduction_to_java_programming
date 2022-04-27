import java.util.Scanner;

class Project2 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      String fav_color = sc.nextLine();
      
      int number = sc.nextInt();
      
      double height = sc.nextDouble();
      
      boolean employment_status = sc.nextBoolean();
      
      char fav_char = sc.next().charAt(0);
      
      System.out.println(fav_color);
      System.out.println(number);
      System.out.println(height);
      System.out.println(employment_status);
      System.out.println(fav_char);
   }
}