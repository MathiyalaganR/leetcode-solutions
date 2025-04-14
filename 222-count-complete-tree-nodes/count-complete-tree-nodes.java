class Solution {
    public int countNodes(TreeNode root) {
        TreeNode temp = root;
        int count = count(temp);
        return count;
    }

    public int count(TreeNode temp) {
        int c = 0;
        if (temp != null) {
            c++;
            c += count(temp.left);  
            c += count(temp.right); 
        }
        return c;
    }
}
