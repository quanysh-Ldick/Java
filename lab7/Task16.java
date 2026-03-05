package lab7;

import java.util.Random;

public class Task16 {

    public static int maxX(int[] arr){

        int max = arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = new int[10];
        Random r = new Random();

        for(int i=0;i<arr.length;i++){

            arr[i] = r.nextInt(50);

            System.out.print(arr[i] + " ");
        }

        System.out.println("\nMax = " + maxX(arr));
    }
}