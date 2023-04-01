import java.util.*;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu based app - Unit conversion for Distance");
        System.out.println("1. CM to M");
        System.out.println("2. M to KM");
        System.out.println("3. KM to M");
        System.out.println("4. M to CM");

        char choice = 'y';
        while (choice == 'y') {
            System.out.print("\nEnter your menu - ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Please enter the CM Value: ");
                    int cm = scanner.nextInt();
                    double m = cm / 100.0;
                    System.out.printf("%d CM = %.2f M\n", cm, m);
                    break;
                case 2:
                    System.out.print("Please enter the M Value: ");
                    double m1 = scanner.nextDouble();
                    double km = m1 / 1000.0;
                    System.out.printf("%.2f M = %.2f KM\n", m1, km);
                    break;
                case 3:
                    System.out.print("Please enter the KM Value: ");
                    double km1 = scanner.nextDouble();
                    double m2 = km1 * 1000.0;
                    System.out.printf("%.2f KM = %.2f M\n", km1, m2);
                    break;
                case 4:
                    System.out.print("Please enter the M Value: ");
                    double m3 = scanner.nextDouble();
                    double cm1 = m3 * 100.0;
                    System.out.printf("%.2f M = %.2f CM\n", m3, cm1);
                    break;
                default:
                    System.out.println("Invalid menu option");
                    break;
            }

            System.out.print("\nDo you want to Continue: ");
            choice = scanner.next().charAt(0);
        }

        scanner.close();
    }
}