import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amount, vatRate, vatAmount, totalAmount;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        amount = input.nextDouble();

        if (amount < 1000) {
            vatRate = 0.18;
        } else {
            vatRate = 0.08;
        }

        System.out.println("VAT Rate: " + vatRate);
        vatAmount = amount * vatRate;
        System.out.println("VAT Amount: " + vatAmount);

        totalAmount = amount + vatAmount;
        System.out.println("Total Amount (Including VAT): " + totalAmount);
    }
}