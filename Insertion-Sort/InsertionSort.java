public class InsertionSort {
    public static void main(String[] args) {

        int nums[] = { 6, 8, 11, 14, 1, 7, 9 };
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
