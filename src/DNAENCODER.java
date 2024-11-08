import java.util.Scanner;

public class DNAENCODER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            StringBuilder encodedSequence = new StringBuilder();

            for (int i = 0; i < n; i += 2) {

                String binaryPair = s.substring(i, i + 2);
                switch (binaryPair) {
                    case "00":
                        encodedSequence.append("A");
                        break;
                    case "01":
                        encodedSequence.append("T");
                        break;
                    case "10":
                        encodedSequence.append("C");
                        break;
                    case "11":
                        encodedSequence.append("G");
                        break;
                }
            }

            System.out.println(encodedSequence.toString());

        }
    }
}