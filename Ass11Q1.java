import java.util.Scanner;

public class Ass11Q1 {
    public static int sqrt(int x) {
        if (x == 0)
            return 0;

        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        int result = sqrt(x);
        System.out.println(result);
    }
}

