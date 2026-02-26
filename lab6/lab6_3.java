public class Lab6_3 {
    public static void main(String[] args) {

        double x = 2;
        double f;

        if (x <= 4) {
            f = Math.pow(x, 2) - 3 * x + 6;
        } else {
            f = 3.5 * Math.pow(x, 5) + 5;
        }

        System.out.println("f(x) = " + f);
    }
}