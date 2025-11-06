import java.util.Scanner;

class Distance {
    int km;
    int m;

    // Method to read distance
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometers: ");
        km = sc.nextInt();
        System.out.print("Enter meters: ");
        m = sc.nextInt();
    }

    // Method to display distance
    void display() {
        System.out.println(km + " kilometers and " + m + " meters");
    }

    // Method to add two distances
    Distance add(Distance d2) {
        Distance temp = new Distance();
        temp.km = this.km + d2.km;
        temp.m = this.m + d2.m;

        // Convert extra meters into kilometers
        if (temp.m >= 1000) {
            temp.km += temp.m / 1000;
            temp.m = temp.m % 1000;
        }

        return temp;
    }
}

public class DistanceDemo {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance sum;

        System.out.println("Enter first distance:");
        d1.read();

        System.out.println("Enter second distance:");
        d2.read();

        sum = d1.add(d2);

        System.out.println("\nFirst Distance: ");
        d1.display();

        System.out.println("Second Distance: ");
        d2.display();

        System.out.println("Total Distance: ");
        sum.display();
    }
}
