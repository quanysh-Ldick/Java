package lab7;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        double[] C = new double[25];
        double product = 1;
        Random r = new Random();

        for(int i=0;i<C.length;i++){
            C[i] = r.nextDouble()*20 - 10;

            if(C[i] > 0){
                product *= C[i];
            }

            System.out.print(C[i] + " ");
        }

        System.out.println("\nProduct of positive elements = " + product);
    }
}