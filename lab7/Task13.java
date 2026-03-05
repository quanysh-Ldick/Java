package lab7;

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {

        int[] C = new int[20];
        int sum = 0;

        Random r = new Random();

        for(int i=0;i<C.length;i++){

            C[i] = r.nextInt(100);
            sum += C[i];

            System.out.print(C[i] + " ");
        }

        double avg = (double) sum / C.length;

        System.out.println("\nAverage = " + avg);
    }
}