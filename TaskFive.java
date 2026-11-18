import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int number = 1; number <= 10; number++) {
            System.out.print("Enter a number: ");
            int digit = input.nextInt();

            if (digit % 2 == 0) {
                System.out.println("Even number: " + digit);
            }
        }
    }
}
