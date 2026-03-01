import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("Enter unit (C / F / K): ");
        char unit = sc.next().toUpperCase().charAt(0);

        double c, f, k;

        switch (unit) {

            case 'C':
                f = (temp * 9 / 5) + 32;
                k = temp + 273.15;
                System.out.println("Fahrenheit: " + f);
                System.out.println("Kelvin: " + k);
                break;

            case 'F':
                c = (temp - 32) * 5 / 9;
                k = c + 273.15;
                System.out.println("Celsius: " + c);
                System.out.println("Kelvin: " + k);
                break;

            case 'K':
                c = temp - 273.15;
                f = (c * 9 / 5) + 32;
                System.out.println("Celsius: " + c);
                System.out.println("Fahrenheit: " + f);
                break;

            default:
                System.out.println("Invalid unit entered!");
        }

        sc.close();
    }
}
