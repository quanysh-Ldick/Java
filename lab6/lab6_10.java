public class Lab6_10 {
    public static void main(String[] args) {

        double x = 3;
        double f = 0;

        if (x > 0 && x < 2) {
            f = Math.sin(Math.pow(x, 2)) + 1.2 * Math.pow(x, 2);
        } else if (x >= 2 && x <= 6) {
            f = Math.tan(x) + Math.cos(Math.pow(x, 2)) + 3.5;
        }

        System.out.println("f(x) = " + f);
    }
}