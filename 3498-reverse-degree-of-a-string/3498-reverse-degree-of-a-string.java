class Solution {
    public int reverseDegree(String s) {
        int totalSum=0;
        for(int i=0; i<s.length(); i++){
            char ch =s.charAt(i);
            int reverseAlphabetIndex= 26-(ch -'a');
             int stringPosition= i+1;

            totalSum += reverseAlphabetIndex * stringPosition;

            

        }
        return totalSum;
    }
}