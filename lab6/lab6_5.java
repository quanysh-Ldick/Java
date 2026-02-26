public class Lab6_5 {
    public static void main(String[] args) {

        double x = 6;
        double f = 0;

        if (x > 0 && x < 2) {
            f = Math.pow(x, 3) + Math.cos(x);
        } else if (x >= 2 && x <= 5) {
            f = 3 * Math.pow(x, 4) + 7;
        } else if (x > 5 && x <= 9) {
            f = 5 * Math.pow(x, 2) + 1.6;
        }

        System.out.println("f(x) = " + f);
    }
}