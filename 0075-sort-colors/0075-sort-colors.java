class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int write = 0;
        
        // Pass 1: Move all 0s to the front
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int temp = nums[write];
                nums[write] = nums[i];
                nums[i] = temp;
                write++;
            }
        }
        
        // Pass 2: Move all 2s to the back
        int back = n - 1;
        int i = write;
        while (i <= back) {
            if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[back];
                nums[back] = temp;
                back--;
            } else {
                i++;
            }
        }
    }
}