import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your weight and height.");

        System.out.print("Weight: ");
        double weight = sc.nextDouble();

        System.out.print("Height: ");
        double height = sc.nextDouble();

        double BMI = weight / (height * height);

        String status = "Normal";

        if (BMI > 28.6) status = "Overweight";
        else if (BMI <= 16.8) status = "Underweight";
        else if (BMI >= 24.4) status = "Risk of overweight";

        System.out.println(status);
    }
}
