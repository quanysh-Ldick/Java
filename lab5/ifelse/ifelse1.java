import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Сан оң");
        } else if (number < 0) {
            System.out.println("Сан теріс");
        } else {
            System.out.println("Сан нөлге тең");
        }
    }
}
