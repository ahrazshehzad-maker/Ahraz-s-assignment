import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double originalPrice, discountPercent, discountedPrice;


        System.out.print("Enter original selling price: ");
        originalPrice = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        discountPercent = sc.nextDouble();

        
        discountedPrice = originalPrice - (originalPrice * discountPercent / 100);

        
        System.out.println("Discounted Selling Price = " + discountedPrice);

        sc.close();
    }
}

    

