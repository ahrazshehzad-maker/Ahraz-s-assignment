import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double discountedPrice, discountPercent, originalPrice;

        System.out.print("Enter discounted selling price: ");
        discountedPrice = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        discountPercent = sc.nextDouble();

    
        originalPrice = discountedPrice / (1 - discountPercent / 100);

    
        System.out.println("Original Selling Price = " + originalPrice);

        sc.close();
    }
}

