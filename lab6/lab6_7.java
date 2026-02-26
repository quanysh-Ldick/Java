public class Lab6_7 {
    public static void main(String[] args) {

        double x = 0.5;
        double f = 0;

        if (x > 0 && x < 1) {
            f = 4 * Math.pow(x, 3) + Math.cos(x);
        } else if (x >= 1) {
            f = 5 * Math.sin(Math.pow(x, 2)) - 9;
        }

        System.out.println("f(x) = " + f);
    }
}