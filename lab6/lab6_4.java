public class Lab6_4 {
    public static void main(String[] args) {

        double x = 1.5;
        double f;

        if (x < 1.22) {
            f = Math.cos(Math.pow(x, 3));
        } else {
            f = 5 * Math.pow(x, 3) + 1.7;
        }

        System.out.println("f(x) = " + f);
    }
}