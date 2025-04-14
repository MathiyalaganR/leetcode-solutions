/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String>arr=new ArrayList<>();
       if(root==null)
       {
        return arr;
       }
       String path=Integer.toString(root.val);
       if(root.left==null && root.right==null)
       {
        arr.add(path);
       }
       if(root.left!=null)
       {
        dfs(root.left,path,arr);
       }
       if(root.right!=null)
       {
        dfs(root.right,path,arr);
       }
       return arr;
    }
    public void dfs(TreeNode node,String path,List<String>arr)
    {
       path+="->"+node.val;
       if(node.left==null&&node.right==null)
       {
        arr.add(path);
       }
       if(node.left!=null)
       {
        dfs(node.left,path,arr);
       }
       if(node.right!=null)
       {
        dfs(node.right,path,arr);
       }
    }
}