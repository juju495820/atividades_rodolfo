/* Matriz Magica de Multipos */

public class ex1 {
    public static void main(String[] args) {
        int[] A = {2,4,6,8,10,12,14,16};
        int[] B = new int[8];

        for(int i = 0; i < A.length; i++){
            B[i] = A[i] * 3;
        }

        for(int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
    }
}