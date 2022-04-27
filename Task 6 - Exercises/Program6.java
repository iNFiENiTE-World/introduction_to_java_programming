import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nickname: ");
        String nickname = sc.next();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Gender: ");
        String gender = sc.next();

        System.out.print("Weight: ");
        double weight = sc.nextDouble();

        System.out.print("Height: ");
        double height = sc.nextDouble();

        System.out.println(nickname);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(weight);
        System.out.println(height);
    }
}
