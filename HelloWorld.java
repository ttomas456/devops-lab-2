import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of values: ");
        int numValues = scanner.nextInt();

        if (numValues <= 0) {
            System.out.println("Please enter a positive number of values.");
            return;
        }

        double sum = 0;

        for (int i = 1; i <= numValues; i++) {
            System.out.print("Value " + i + ": ");
            sum += scanner.nextDouble();
        }

        double average = sum / numValues;

        System.out.println("Average: " + average);

        scanner.close();
    }
}
