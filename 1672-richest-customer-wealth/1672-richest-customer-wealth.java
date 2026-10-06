class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int currnt=0;
        for(int i =0; i<accounts.length;i++){
            for(int j =0; j<accounts[i].length;j++){
            currnt+= accounts[i][j];
        }
         max = Math.max(max, currnt);
         currnt=0;
        }
       return max;
    }
}