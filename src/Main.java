import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the game tester: ");
        String name = scanner.nextLine();

        System.out.print("Enter 1 for Full-Time or 2 for Part-Time: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            FullTimeGameTester fullTimeTester = new FullTimeGameTester(name);
            System.out.println("Full-Time Game Tester: " + fullTimeTester.name);
            System.out.println("Salary: $" + fullTimeTester.calculateSalary());
        } else if (choice == 2) {
            System.out.print("Enter the number of hours worked: ");
            int hoursWorked = scanner.nextInt();

            PartTimeGameTester partTimeTester = new PartTimeGameTester(name, hoursWorked);
            System.out.println("Part-Time Game Tester: " + partTimeTester.name);
            System.out.println("Salary: $" + partTimeTester.calculateSalary());
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}