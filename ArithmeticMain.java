import java.util.Scanner;

class ArithmeticMain {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter two numbers: ");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      
      int add = num1 + num2;
      int sub = num1 - num2;
      int mul = num1 * num2;
      int div = num1 / num2;
      int mod = num1 % num2;
      
      System.out.println("Addition: " + add);
      System.out.println("Subtraction: " + sub);
      System.out.println("Multiplication: " + mul);
      System.out.println("Division: " + div);
      System.out.println("Modulus: " + mod);
   }
}