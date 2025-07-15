    import java.util.Scanner;

    public class Fibonacci {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number of terms: ");
            int n = input.nextInt();
            int a = 0, b = 1;
            System.out.print("Fibonacci Series: " + a + ", " + b);
            for (int i = 2; i < n; ++i) {
                int nextTerm = a + b;
                System.out.print(", " + nextTerm);
                a = b;
                b = nextTerm;
            }
            System.out.println();
            input.close();
        }
    }