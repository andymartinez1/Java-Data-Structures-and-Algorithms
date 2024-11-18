public class LinearSearch {
    public static void main(String[] args) {

        int nums[] = { 1, 7, 5, 9, 6, 12, 36, 47, 5, 12 };
        int target = 12;

        int result = linearSearch(nums, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;

        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken: " + steps);
                return i;
            }
        }

        System.out.println("Steps taken: " + steps);
        return -1;
    }
}