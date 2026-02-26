public class Lab6_9 {
    public static void main(String[] args) {

        double x = 2.5;
        double f;

        if (x >= 0 && x < 1) {
            f = Math.cos(Math.pow(x, 2)) + Math.sin(x);
        } else if (x >= 1 && x <= 2) {
            f = 6 * Math.pow(x, 2) + Math.sin(Math.pow(x, 3));
        } else {
            f = 1.7 * Math.pow(x, 3) + 7;
        }

        System.out.println("f(x) = " + f);
    }
}