public class Lab6_1 {
    public static void main(String[] args) {

        double x = 3; 
        double f;

        if (x < 2) {
            f = 5 * Math.pow(x, 2) - 6;
        } else {
            f = 7 * Math.pow(x, 3) + 5;
        }

        System.out.println("f(x) = " + f);
    }
}
