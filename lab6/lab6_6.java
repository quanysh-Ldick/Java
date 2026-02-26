public class Lab6_6 {
    public static void main(String[] args) {

        double x = 2;
        double f;

        if (x < 1.5) {
            f = Math.tan(x) * Math.sin(Math.pow(x, 3));
        } else if (x >= 1.5 && x < 2.5) {
            f = Math.pow(x, 3) + Math.sin(x);
        } else {
            f = 3 * Math.pow(x, 3) + 5;
        }

        System.out.println("f(x) = " + f);
    }
}