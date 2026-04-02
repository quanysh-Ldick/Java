import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("Нәтиже: " + (x + y));
        } catch (InputMismatchException e) {
            System.out.println("Қате енгізу!");
        }
    }
}