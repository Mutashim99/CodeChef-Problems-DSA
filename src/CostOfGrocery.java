import java.util.Scanner;

public class CostOfGrocery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = scanner.nextInt();
            }
            int totalCost = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] >= X) {
                    totalCost += B[i];
                }
            }
            System.out.println(totalCost);
    }
}
