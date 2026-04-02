import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Өрнек енгіз (мысалы: 2 + 3 * 4): ");
        String expr = sc.nextLine();

        String[] tokens = expr.split(" ");

        double result = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String op = tokens[i];
            double num = Double.parseDouble(tokens[i + 1]);

            switch (op) {
                case "+": result += num; break;
                case "-": result -= num; break;
                case "*": result *= num; break;
                case "/": result /= num; break;
            }
        }

        System.out.println("Нәтиже: " + result);
    }
}