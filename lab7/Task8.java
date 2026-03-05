package lab7;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {

        double[][] A = new double[12][6];
        double[] product = new double[6];

        Random r = new Random();

        for(int j=0;j<6;j++){
            product[j] = 1;
        }

        for(int i=0;i<12;i++){

            for(int j=0;j<6;j++){

                A[i][j] = r.nextDouble()*20 - 10;

                if(A[i][j] < 0){
                    product[j] *= A[i][j];
                }

                System.out.print(A[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Column negative product:");

        for(int j=0;j<6;j++){
            System.out.print(product[j] + " ");
        }
    }
}