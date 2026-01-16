
    import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total obtained marks: ");
        double obtainedMarks = sc.nextDouble();

        System.out.print("Enter maximum marks: ");
        double maximumMarks = sc.nextDouble();

        double percentage = (obtainedMarks / maximumMarks) * 100;

        System.out.println(percentage);

        sc.close();
    }
}

