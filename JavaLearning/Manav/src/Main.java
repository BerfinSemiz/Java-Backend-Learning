import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double pearPrice = 2.14,
                applePrice = 3.67,
                tomatoPrice = 1.11,
                bananaPrice = 0.95,
                eggplantPrice = 5.00;

        Scanner input =new Scanner(System.in);

        System.out.print("Enter the weight of pears (kg): ");
        double pearWeight = input.nextDouble();

        System.out.print("Enter the weight of apples (kg): ");
        double appleWeight = input.nextDouble();

        System.out.print("Enter the weight of tomatoes (kg): ");
        double tomatoWeight = input.nextDouble();

        System.out.print("Enter the weight of bananas (kg): ");
        double bananaWeight = input.nextDouble();

        System.out.print("Enter the weight of eggplants (kg): ");
        double eggplantWeight = input.nextDouble();

        double totalCost = (pearWeight * pearPrice) +
                (appleWeight * applePrice) +
                (tomatoWeight * tomatoPrice) +
                (bananaWeight * bananaPrice) +
                (eggplantWeight * eggplantPrice);

        System.out.printf("Total cost: %.2f TL\n", totalCost);



    }
}