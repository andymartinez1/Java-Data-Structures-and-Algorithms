public class RecursiveBinarySearch {

    public static void main(String[] args) {

        int nums[] = { 1, 7, 8, 9, 6, 12, 36, 47, 5, 11 };
        int len = nums.length;
        int target = 5;

        int result = recursiveBinarySearch(nums, target, 0, len - 1);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }

    public static int recursiveBinarySearch(int[] nums, int target, int left, int right) {

        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;

            } else if (nums[mid] < target) {
                return recursiveBinarySearch(nums, target, mid + 1, right);

            } else {
                return recursiveBinarySearch(nums, target, left, mid - 1);
            }
        }

        return -1;
    }
}
