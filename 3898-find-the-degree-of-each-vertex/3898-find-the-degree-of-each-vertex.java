class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int [] ans= new int[n];

        for(int i=0; i<n;i++){
            int degree=0;
            for(int j=0;j<matrix[i].length;j++){
                degree+= matrix[i][j];
            }
            ans[i]= degree;
        }
        return ans;
    }
}