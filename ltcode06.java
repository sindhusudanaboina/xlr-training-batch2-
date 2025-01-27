public class ltcode06 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5};
        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}