class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Set<List<Integer>> result = new HashSet<>();
        // int n= nums.length;
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-1;j++){

        //         for(int k=j+1;k<n;k++){

        //             if(nums[i]+nums[j]+nums[k]==0){

        //                 List<Integer> triplet= Arrays.asList(nums[i],nums[j],nums[k]);
        //                 Collections.sort(triplet);
        //                 result.add(triplet);
        //             }

        //      }
        // }
        // }
        // return new ArrayList<>(result);

        List<List<Integer>> result = new ArrayList<>();
        
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        // Step 2: Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Optimization: Since the array is sorted, if the first number is > 0, 
            // the sum can never be zero.
            if (nums[i] > 0) {
                break;
            }
            
            // Skip duplicate elements for 'i' to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Step 3: Two-pointer approach
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for 'left'
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for 'right'
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // We need a larger sum
                } else {
                    right--; // We need a smaller sum
                }
            }
        }
        
        return result;
 
        }
    
}