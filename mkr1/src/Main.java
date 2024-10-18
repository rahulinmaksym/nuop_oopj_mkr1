import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1");
        Patient patient = new Patient(
                1,
                "John Skywalker",
                "Odesa, Marseljsjka 88",
                884201161L,
                100000000,
                "SAIDS"
        );
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Which value would you like to view?");
            System.out.println("""
                    0 - exit;
                    1 - id;
                    2 - name;
                    3 - address;
                    4 - phoneNumber;
                    5 - medId;
                    6 - diagnosis
                    7 - all data""");
            int value = input.nextInt();
            input.nextLine();
            if(value == 0) {
                break;
            }
            patient.show(value);
        }

        System.out.println("\n\nTask 2");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the vectors (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of vectors (m): ");
        int m = scanner.nextInt();

        Vector<Double>[] vectors = new Vector[m];

        for (int i = 0; i < m; i++) {
            vectors[i] = new Vector<>(n);
            System.out.println("Enter vector " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                vectors[i].add(scanner.nextDouble());
            }
        }

        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                double angle = angleBetween(vectors[i], vectors[j]);
                System.out.printf("Angle between vector %d and vector %d: %.2f degrees%n", i + 1, j + 1, angle);
            }
        }
    }

    public static double dotProduct(Vector<Double> v1, Vector<Double> v2) {
        double dotProduct = 0;
        for (int i = 0; i < v1.size(); i++) {
            dotProduct += v1.get(i) * v2.get(i);
        }
        return dotProduct;
    }

    public static double magnitude(Vector<Double> v) {
        double sum = 0;
        for (double element : v) {
            sum += element * element;
        }
        return Math.sqrt(sum);
    }

    public static double angleBetween(Vector<Double> v1, Vector<Double> v2) {
        double dotProd = dotProduct(v1, v2);
        double magnitudeV1 = magnitude(v1);
        double magnitudeV2 = magnitude(v2);
        return Math.acos(dotProd / (magnitudeV1 * magnitudeV2)) * (180.0 / Math.PI); // converting to degrees
    }
}