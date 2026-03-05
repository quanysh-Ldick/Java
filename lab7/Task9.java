package lab7;

import java.util.Random;

public class Task9 {
    public static void main(String[] args) {

        int[][] C = new int[5][5];
        int product = 1;

        Random r = new Random();

        for(int i=0;i<5;i++){

            for(int j=0;j<5;j++){

                C[i][j] = r.nextInt(20) - 10;

                System.out.print(C[i][j] + " ");
            }

            System.out.println();
        }

        for(int i=0;i<5;i++){

            if(C[i][i] > 0){
                product *= C[i][i];
            }
        }

        System.out.println("Diagonal positive product = " + product);
    }
}