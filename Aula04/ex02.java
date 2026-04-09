/*Subtraindo Matrizes*/

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] A = new double[5];
        double[] B = new double[5];
        double[] C = new double[5];

        for(int i = 0; i < 5; i++){
            System.out.print("A: ");
            A[i] = sc.nextDouble();

            System.out.print("B: ");
            B[i] = sc.nextDouble();

            C[i] = A[i] - B[i];
        }

        for(double x : C){
            System.out.print(x + " ");
        }
    }
}