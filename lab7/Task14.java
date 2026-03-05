package lab7;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {

        int[] D = new int[30];
        int even = 0;
        int odd = 0;

        Random r = new Random();

        for(int i=0;i<D.length;i++){

            D[i] = r.nextInt(100);

            if(D[i] % 2 == 0){
                even += D[i];
            } else {
                odd += D[i];
            }

            System.out.print(D[i] + " ");
        }

        System.out.println("\nEven sum = " + even);
        System.out.println("Odd sum = " + odd);
    }
}