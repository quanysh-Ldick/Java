public class Lab6_12 {
    public static void main(String[] args) {

        double x = 2;
        double f;

        if (x >= 0 && x < 2) {
            f = 1.7 * x + Math.sin(Math.pow(x, 3));
        } else {
            f = Math.cos(x) + Math.tan(Math.pow(x, 3));
        }

        System.out.println("f(x) = " + f);
    }
}