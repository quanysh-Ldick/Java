package lab7;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        int[][] A = new int[10][10];
        int[] B = new int[10];
        Random r = new Random();

        for(int i=0;i<10;i++){

            for(int j=0;j<10;j++){

                A[i][j] = r.nextInt(50) - 25;

                if(A[i][j] < 0){
                    B[i] += A[i][j];
                }

                System.out.print(A[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Row negative sums:");

        for(int i=0;i<10;i++){
            System.out.print(B[i] + " ");
        }
    }
}