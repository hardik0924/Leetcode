class Solution {
    public int maxArea(int[] height) {
        int right =height.length-1;
        int left=0;
        int maxArea = 0;

        while(right>left){
         maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

         if(height[left]<height[right]){
            left++;
         }else{
            right --;
         }



            // right ++;
            // left--;
        }
        return maxArea;
    }
}