public class pattern7 {
    public static void main(String[] args) {
        int n = 5; // Number of rows for half the butterfly

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
