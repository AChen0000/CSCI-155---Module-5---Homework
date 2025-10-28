import java.util.Scanner;

public class Grades {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade;

        while (true) {
            System.out.print("Enter a number grade (0–100) or -1 to quit: ");
            grade = input.nextInt();

            if (grade == -1) {
                System.out.println("Bye!");
                break;
            }
            //Convert to letter grade
            if (grade > 100 || grade < 0) {
                System.out.println("Something seems wrong. Please enter a number between 0 and 100.");
            } else if (grade >= 90) {
                System.out.println("Letter grade: A");
            } else if (grade >= 80) {
                System.out.println("Letter grade: B");
            } else if (grade >= 70) {
                System.out.println("Letter grade: C");
            } else if (grade >= 60) {
                System.out.println("Letter grade: D");
            } else {
                System.out.println("Letter grade: F");
            }

            System.out.println(); // Add blank line for spacing
        }
        //Finish
        input.close();
    }
}
