import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the integer input
        int n = sc.nextInt();

        // Calculate the sum using the formula: n * (n + 1) / 2
        // Using 'long' prevents integer overflow for large values of n
        long sum = (long) n * (n + 1) / 2;

        // Print the result
        System.out.println(sum);

        sc.close();
    }
}
