package lab7;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        int[] A = new int[20];
        int sum = 0;
        Random r = new Random();

        for(int i=0;i<A.length;i++){
            A[i] = r.nextInt(100) - 50;
            if(A[i] < 0){
                sum += A[i];
            }
            System.out.print(A[i] + " ");
        }

        System.out.println("\nNegative elements sum = " + sum);
    }
}