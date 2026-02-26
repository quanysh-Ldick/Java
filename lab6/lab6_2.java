public class Lab6_2 {
    public static void main(String[] args) {

        double x = -1;
        double f = 0;

        if (x >= 0) {
            f = Math.sqrt(Math.pow(x, 3) + 5);
        } else if (x > -3 && x < 0) {
            f = 3 * Math.pow(x, 4) + 9;
        }

        System.out.println("f(x) = " + f);
    }
}