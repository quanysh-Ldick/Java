package lab7;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        double[] D = new double[17];
        double sum = 0;
        Random r = new Random();

        for(int i=0;i<D.length;i++){
            D[i] = r.nextDouble()*100;
            sum += D[i];

            System.out.print(D[i] + " ");
        }

        double avg = sum / D.length;

        System.out.println("\nAverage = " + avg);
    }
}