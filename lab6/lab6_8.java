public class Lab6_8 {
    public static void main(String[] args) {

        double x = 1;
        double f = 0;

        if (x > -5 && x < 0) {
            f = Math.pow(x, 2) - 3;
        } else if (x >= 0 && x < 2) {
            f = 5 * Math.pow(x, 3) + Math.cos(x);
        }

        System.out.println("f(x) = " + f);
    }
}