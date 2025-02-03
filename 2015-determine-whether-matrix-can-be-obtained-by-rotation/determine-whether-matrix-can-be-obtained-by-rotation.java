	class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int c90=0;
        int c0=0;
        int c180=0;
        int c270=0;
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                if(mat[i][j]==target[i][j]){
                    c0++;
                }
                if(mat[i][j]==target[j][n-i-1]){
                    c90++;
                }
                 if(mat[i][j]==target[n-i-1][n-j-1]){
                    c180++;
                }
                if(mat[i][j]==target[n-j-1][i]){
                    c270++;
                }
            }
        }
        if(c0==n*n||c90==n*n||c180==n*n||c270==n*n)
        return true;
        else return false;
    }
}