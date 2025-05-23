class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minrow=m;
        int mincol=n;
        for(int[]op:ops)
        {
           minrow=Math.min(minrow,op[0]);
           mincol=Math.min(mincol,op[1]);
        }
        return minrow*mincol;
    }
}