import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int number = sc.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Сан 3-ке де, 5-ке де бөлінеді");
        } else {
            System.out.println("Бірдей бөлінбейді");
        }
    }
}
