import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //We use scanner to input the values
        Scanner scanner = new Scanner(System.in);
        
        //We ask users to enter the number of values
        System.out.print("Enter the number of values: ");
        int numValues = scanner.nextInt();

        if (numValues <= 0) {
            System.out.println("Please enter a positive number of values.");
            return;
        }

        double sum = 0;
        double smallest = Double.MAX_VALUE; //Initialize smallest to the largest possible value
        double largest = Double.MIN_VALUE; //Initialize largest to the smallest possible value

        for (int i = 1; i <= numValues; i++) {
            System.out.print("Value " + i + ": ");
            double value = scanner.nextDouble();

            sum += value;

            if(value < smallest) {
                smallest = value;
            }

            if(value > largest) {
                largest = value;
            } 
            
            //Print out the statement
            System.out.println("Average: " + average);
            System.out.println("Smallest: " + smallest);
            System.out.println("Largest: " + largest);

            //Use scanner to close the program
            scanner.close();

            double average = sum / numValues;

        }

    }

