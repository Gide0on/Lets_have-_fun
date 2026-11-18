import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        for (int number = 1; number <= 10; number++) {
            System.out.print("Enter a Score: ");
            int score = input.nextInt();

            if (number % 2 == 0) {
                total = total + score;
            }
        }

        System.out.println("The Total is: " + total);
    }
}


