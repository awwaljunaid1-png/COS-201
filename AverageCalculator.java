import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Enter first examination score: ");
        double score1 = input.nextDouble();

        System.out.print("Enter second examination score: ");
        double score2 = input.nextDouble();

        System.out.print("Enter third examination score: ");
        double score3 = input.nextDouble();

        double total = score1 + score2 + score3;
        double average = total / 3;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);

        input.close();
    }
}
