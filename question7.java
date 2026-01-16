import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter an integer: ");
        number = sc.nextInt();

        if (number % 2 != 0) {
            System.out.println("ODD");
        } else {
            System.out.println("EVEN");
        }

        sc.close();
    }
}

