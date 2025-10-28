import java.util.Scanner;

public class Squares {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        while (true) {
            System.out.print("Enter the size of the square (or 0 to quit): ");
            size = input.nextInt();
            //End loop
            if (size == 0) {
                System.out.println("Bye!");
                break;
            }

            // Solid square
            System.out.println("\nSolid Square:");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Hollow square
            System.out.println("\nHollow Square:");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == size - 1 || j == 0 || j == size - 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }

            System.out.println();
        }
        //Finish
        input.close();
    }
}
