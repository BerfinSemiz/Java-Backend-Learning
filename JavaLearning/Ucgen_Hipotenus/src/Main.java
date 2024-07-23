import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        double h, u, perimeter, area;
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        x = input.nextInt();

        System.out.print("Enter the length of the second side: ");
        y = input.nextInt();

        h = Math.sqrt((x*x)+(y*y));
        System.out.println("hipotenüs:"+ h);

        u = (x + y + h) / 2;

        perimeter = 2*u;
        System.out.println("Ucgenin cevresi: "+ perimeter);

        area = u * (u - x)* (u - y) * (u - h);
        System.out.print(" Ucgenin Alani:"+ area);

        }
}
