package lab7;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {

        double[][] D = new double[7][7];
        double sum = 0;

        Random r = new Random();

        for(int i=0;i<7;i++){

            for(int j=0;j<7;j++){

                D[i][j] = r.nextDouble()*10;

                System.out.print(D[i][j] + " ");
            }

            System.out.println();
        }

        for(int i=0;i<7;i++){
            sum += D[i][i];
        }

        double avg = sum / 7;

        System.out.println("Diagonal average = " + avg);
    }
}