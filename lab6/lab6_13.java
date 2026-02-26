public class Lab6_13 {
    public static void main(String[] args) {

        double x = 4;
        double f = 0;

        if (x >= 1 && x <= 3) {
            f = 5 * Math.sin(Math.pow(x, 2)) * (1 + Math.log(x));
        } else if (x > 3 && x <= 5) {
            f = Math.exp(Math.pow(x, 2)) + Math.exp(3);
        }

        System.out.println("f(x) = " + f);
    }
}