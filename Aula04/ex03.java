/*Poder dos quadrados*/

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];

        for(int i = 0; i < 15; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < 15; i++){
            B[i] = A[i] * A[i];
        }

        System.out.print("A: ");
        for(int x : A){
            System.out.print(x + " ");
        }

        System.out.print("\nB: ");
        for(int x : B){
            System.out.print(x + " ");
        }
    }
}