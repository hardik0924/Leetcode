class Solution {
    public int[] findErrorNums(int[] nums) {
        // int  currentNum= new int[nums.length];
        int n= nums.length;
        int [] res= new int[2];
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
           if(nums[i]==nums[i+1]){
            
              res[0]=nums[i];
              break;
           }

        }
     for(int target=1;target<=n;target++){
            boolean found=false;
            for(int i=0;i<n;i++){
                if(nums[i]==target){
                    found=true;
                    break;
                }
             }
                if (!found) {
                res[1] = target;
                break;
              }
              
        }
        
        return res;     

    }
}