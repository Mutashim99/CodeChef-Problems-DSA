import java.util.Scanner;

public class MinToMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int M = Integer.MAX_VALUE;
        for (int num : A) {
            if (num < M) {
                M = num;
            }
        }
        int operations = 0;
        for (int num : A) {
            if (num > M) {
                operations++;
            }
        }
        System.out.println(operations);
    }
}
