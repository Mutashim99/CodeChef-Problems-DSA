import java.util.Scanner;

public class TakeDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            int totalPriceWithoutCoupon = 0;
            for (int price : A) {
                totalPriceWithoutCoupon += price;
            }

            int totalPriceWithCoupon = X;
            for (int price : A) {
                if (price <= Y) {
                    totalPriceWithCoupon += 0;
                } else {
                    totalPriceWithCoupon += (price - Y);
                }
            }

            if (totalPriceWithCoupon < totalPriceWithoutCoupon) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }
        }
    }
}
