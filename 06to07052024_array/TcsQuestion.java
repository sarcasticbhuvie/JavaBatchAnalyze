import java.util.Scanner;

public class TcsQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :");
        int n = sc.nextInt();
        int[] a = new int[n];
        int s = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            sum += a[i];
        }
        System.out.println("Missing Number : " + (s - sum));
        sc.close();
    }
}
