import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, fare, kmRate = 2.20, baseFare = 10.0, minFare = 20.0;

        Scanner input = new Scanner(System.in);
        System.out.println("How many kilometers did you travel?");
        km = input.nextDouble();

        fare = baseFare + (km * kmRate);

        if (fare < minFare) {
            fare = minFare;
        }

        System.out.println("Payment Amount: " + fare);
    }
}
