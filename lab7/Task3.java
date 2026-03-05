package lab7;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        double[] A = new double[12];
        double product = 1;
        Random r = new Random();

        for(int i=0;i<A.length;i++){
            A[i] = r.nextDouble()*20 - 10;

            if(A[i] < 0){
                product *= A[i];
            }

            System.out.print(A[i] + " ");
        }

        System.out.println("\nProduct of negative elements = " + product);
    }
}