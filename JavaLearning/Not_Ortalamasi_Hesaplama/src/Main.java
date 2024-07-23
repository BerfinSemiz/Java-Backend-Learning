import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math, physics, turkish, history, music;
        Scanner inp = new Scanner(System.in);

        System.out.print("Your Mathematics Grade:");
        math = inp.nextInt();

        System.out.print("Your Physics Grade :");
        physics = inp.nextInt();

        System.out.print("Your Turkish Grade: ");
        turkish = inp.nextInt();

        System.out.print("Your History Grade: ");
        history = inp.nextInt();

        System.out.print("Your Music Grade: ");
        music = inp.nextInt();

        int total =(math + physics + turkish + history + music);
        double average = total/5.0;
        System.out.println("Your Avarage:" + average);

        String result = (average >= 60) ? "Passed" : "Failed";
        System.out.println("Result: " + result);

    }
}