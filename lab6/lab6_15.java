public class Lab6_15 {
    public static void main(String[] args) {

        double x = 5;
        double f = 0;

        if (x >= 1 && x <= 3) {
            f = Math.sin(Math.pow(x, 4)) + Math.log(Math.pow(x, 2));
        } else if (x > 3 && x <= 7) {
            f = 1.5 * Math.exp(Math.pow(x, 3)) - Math.log(x);
        }

        System.out.println("f(x) = " + f);
    }
}