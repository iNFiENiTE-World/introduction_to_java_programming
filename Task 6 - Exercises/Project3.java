import java.util.Scanner;

class Project3 {
   public static void main (String[] args) {
      Scanner sc = new Scanner (System.in);
      double length = sc.nextDouble();
      double width = sc.nextDouble();
      double height = sc.nextDouble();
      
      System.out.println("Perimeter: " + Perimeter(length, width, height));
      System.out.println("Surface area: " + SurfaceArea(length, width, height));
      System.out.println("Volume: " + Volume(length, width, height));
   }
   
   static double Perimeter(double length, double width, double height){
      return length * 4 + width * 4 + height * 4;
   }
   
   static double SurfaceArea (double length, double width, double height){
      return 2 * ( length * height + width * height + width * length );
   }
   
   static double Volume (double length, double width, double height){
      return length * width * height;
   }
}