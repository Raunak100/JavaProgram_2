public class StarPattern {
    public static void main(String[] args) {
        int numberOfRows = 5; // Number of rows for the pattern

        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
