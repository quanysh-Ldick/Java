import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        System.out.println("sin: " + Math.sin(Math.toRadians(x)));
        System.out.println("cos: " + Math.cos(Math.toRadians(x)));
        System.out.println("tan: " + Math.tan(Math.toRadians(x)));
    }
}