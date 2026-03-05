package lab7;

import java.util.Arrays;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {

        int[] B = new int[25];
        Random r = new Random();

        for(int i=0;i<B.length;i++){
            B[i] = r.nextInt(100);
            System.out.print(B[i] + " ");
        }

        Arrays.sort(B);

        System.out.println("\nSorted:");

        for(int i=0;i<B.length;i++){
            System.out.print(B[i] + " ");
        }
    }
}