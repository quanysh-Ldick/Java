package lab7;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

        double[][] B = new double[5][5];
        double[] A = new double[5];

        Random r = new Random();

        for(int i=0;i<5;i++){

            for(int j=0;j<5;j++){

                B[i][j] = r.nextDouble()*20 - 10;

                if(B[i][j] > 0){
                    A[i] += B[i][j];
                }

                System.out.print(B[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Row positive sums:");

        for(int i=0;i<5;i++){
            System.out.print(A[i] + " ");
        }
    }
}