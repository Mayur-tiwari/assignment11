import java.util.*;

public class Ass11Q8 {
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        // Create two HashMaps to store the frequency of elements in each array
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        // Populate the frequency maps
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>();

        // Iterate over the elements in nums1 and nums2
        for (int num : nums1) {
            if (map2.containsKey(num) && map2.get(num) > 0) {
                intersection.add(num);
                map2.put(num, map2.get(num) - 1);
            }
        }

        // Convert the intersection list to an array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] intersection = findIntersection(nums1, nums2);

        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}
