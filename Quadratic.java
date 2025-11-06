import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get coefficients from user
        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;

        System.out.println("\nDiscriminant (b² - 4ac) = " + discriminant);

        // Determine and display roots
        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            // Two equal real roots
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root 1 = Root 2 = " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and conjugate.");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }

        input.close();
    }
}
