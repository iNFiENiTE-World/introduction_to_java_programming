import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter CGPA value: ");
        double cgpa = sc.nextDouble();

        String grade = "F";

        if (cgpa <= 4) {
            grade = "A";
        }
        else if (cgpa <= 3.67) {
            grade = "A-";
        }
        else if (cgpa <= 3.33) {
            grade = "B+";
        }
        else if (cgpa <= 3) {
            grade = "B";
        }
        else if (cgpa <= 2.67) {
            grade = "B-";
        }
        else if (cgpa <= 2.33) {
            grade = "C+";
        }
        else if (cgpa <= 2) {
            grade = "C";
        }
        else if (cgpa <= 1.67) {
            grade = "C-";
        }
        else if (cgpa <= 1.33) {
            grade = "D";
        }
        else if (cgpa <= 1) {
            grade = "E";
        }

        System.out.println(grade);
    }
}
