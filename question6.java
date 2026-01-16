import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, h, area;
        
        System.out.print("Enter length of first parallel side (a): ");
        a = sc.nextDouble();

        System.out.print("Enter length of second parallel side (b): ");
        b = sc.nextDouble();

        System.out.print("Enter height (h): ");
        h = sc.nextDouble();

        area = h * (a + b) / 2;

        System.out.println("Area of the Trapezoid = " + area);

        sc.close();
    }
}

