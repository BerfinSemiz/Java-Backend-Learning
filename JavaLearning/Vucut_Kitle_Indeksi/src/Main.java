import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight, height, index;

        Scanner input =new Scanner(System.in);
        System.out.print("Please enter your weight (in kg): ");
        weight = input.nextDouble();

        System.out.print("Please enter your height (in meters-> ex: 1,83): ");
        height = input.nextDouble();

        index = weight/(height*height);
        System.out.println(" Here is your body mass index: "+ index);

        String category;
        if (index < 18.5) {
            category = "Underweight";
        } else if (index < 24.9) {
            category = "Normal weight";
        } else if (index < 29.9) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }

        System.out.println("BMI Category: " + category);

    }
}