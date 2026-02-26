public class Lab6_14 {
    public static void main(String[] args) {

        double x = 2;
        double f = 0;

        if (x >= 1 && x <= 4) {
            f = Math.tan(3 * Math.pow(x, 4)) + Math.log(5 * x);
        } else if (x >= -1 && x < 1) {
            f = Math.pow(x, 3) + Math.pow(x, 2);
        }

        System.out.println("f(x) = " + f);
    }
}