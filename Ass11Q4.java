import java.util.Scanner;
public class Ass11Q4 {
    public static int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int slow = nums[0];
        int fast = nums[0];

        // Move slow pointer by one step and fast pointer by two steps
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Move slow pointer back to the start and advance both pointers by one step
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        int repeatedNumber = findDuplicate(nums);
        System.out.println(repeatedNumber);
    }
}
