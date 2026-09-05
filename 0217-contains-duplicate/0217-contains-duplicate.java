// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//          boolean yes = false;

//         for (int i=0; i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     yes= true;
//                     break;
//                 }
//             }
//             if(yes){
//                 break;
//             }
//         }
//         return yes;
//     }
//      public static void main (String[]args){
//         Solution solution = new Solution(); 
//         int [] nums={1,2,3,1};
//          System.out.println(solution.containsDuplicate(nums));
        
//     }
// }

/* Approch Two  */
 class Solution {
  public boolean containsDuplicate(int[] nums) {
            HashSet <Integer>  seen= new HashSet<>();

            for(int num:nums){
                     if(seen.contains(num)){
                        return true;
                    }
            seen.add(num);

            }

  return false;
        }

 }
