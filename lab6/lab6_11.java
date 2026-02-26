public class Lab6_11 {
    public static void main(String[] args) {

        double x = 5;
        double f;

        if (x >= 0 && x <= 4) {
            f = 6 * x + Math.sin(Math.PI * Math.pow(x, 2));
        } else {
            f = Math.log(Math.pow(x, 5)) + 3 * Math.pow(x, 7);
        }

        System.out.println("f(x) = " + f);
    }
}