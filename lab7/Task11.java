package lab7;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {

        int[] A = new int[25];
        Random r = new Random();

        for(int i=0;i<A.length;i++){
            A[i] = r.nextInt(100);
            System.out.print(A[i] + " ");
        }

        int min = 0;
        int max = 0;

        for(int i=1;i<A.length;i++){

            if(A[i] < A[min]){
                min = i;
            }

            if(A[i] > A[max]){
                max = i;
            }
        }

        int temp = A[min];
        A[min] = A[max];
        A[max] = temp;

        System.out.println("\nAfter swap:");

        for(int i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }
    }
}