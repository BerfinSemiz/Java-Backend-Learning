import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double r, circumference, area;
        final double pi = 3.14;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        r = input.nextDouble();


        area = (pi * r * r) ;
        circumference = 2 * pi * r;

        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle:"+area);

        int a;
        System.out.print("Enter the central angle of the sector (in degrees): ");
        a = input.nextInt();

        double sectorArea = (pi * r * r) * a / 360 ;
        double sectorPerimeter;
        if (a == 360){
            sectorPerimeter = circumference;
        }else {
            sectorPerimeter = ((2 * pi * r) * a / 360) + 2 * r;
        }

        System.out.println("Perimeter of the sector: " + sectorPerimeter);
        System.out.println("Area of the sector: " + sectorArea);

    }
}