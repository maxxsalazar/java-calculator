import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstName = null;
        String lastName = null;
        String social = null;
        double hours;
        double wage;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first name: ");
        firstName = scan.next();

        System.out.print("Enter last name: ");
        lastName = scan.next();

        System.out.print("Enter Social security number: ");
        social = scan.next();

        System.out.print("Enter hours worked: ");
        hours = scan.nextDouble();

        System.out.print("Enter hourly wage: ");
        wage = scan.nextDouble();
        System.out.println();

        HourlyEmployee employee = new HourlyEmployee(firstName, lastName, social, wage, hours);

        System.out.println(employee);
    }

}
