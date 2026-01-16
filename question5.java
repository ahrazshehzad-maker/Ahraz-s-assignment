import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double voltage, current, power;

        System.out.print("Enter voltage (Volts): ");
        voltage = sc.nextDouble();

        System.out.print("Enter current (Amperes): ");
        current = sc.nextDouble();

        power = voltage * current;

        System.out.println("Power Consumption = " + power + " Watts");

        sc.close();
    }
}

