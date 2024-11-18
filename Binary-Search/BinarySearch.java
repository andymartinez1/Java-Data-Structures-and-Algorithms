public class BinarySearch {
    public static void main(String[] args) {

        int nums[] = { 1, 7, 5, 9, 6, 12, 36, 47, 5, 12 };
        int target = 36;

        int result = binarySearch(nums, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }

    /* BINARY SEARCH O(log n) Logarithmic Time */
    public static int binarySearch(int[] nums, int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            steps++;
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                System.out.println("Steps taken: " + steps);
                return mid;

            } else if (nums[mid] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }

        System.out.println("Steps taken: " + steps);
        return -1;
    }
}
