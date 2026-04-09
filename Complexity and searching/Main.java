import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {3, 64, 1001, 28, 39, -99, 123, 619, 71};
        
        Arrays.sort(numbers);

        // Test case 1 - searching for a value that exists
        int index = binarySearch(numbers, 619);

        // Test case 2 - searching for value that doesn't exist
        // int index = binarySearch(numbers, 85);

        if (index != -1) {
            System.out.println("Target has been found");
        }
        else {
            System.out.println("Target has not been found");
        }
    }

    static int binarySearch(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] < target) left = mid + 1;
        }

        return -1;
    }
}
