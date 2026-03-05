package lab7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] B = new int[15];
        int sum = 0;
        Random r = new Random();

        for(int i=0;i<B.length;i++){
            B[i] = r.nextInt(100) - 50;
            if(B[i] > 0){
                sum += B[i];
            }
            System.out.print(B[i] + " ");
        }

        System.out.println("\nPositive elements sum = " + sum);
    }
}