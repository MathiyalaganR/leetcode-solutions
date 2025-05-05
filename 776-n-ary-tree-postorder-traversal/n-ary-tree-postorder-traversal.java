/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer>result=new ArrayList<>();
        helper(root,result);
        return result;
    }
    public void helper(Node root,List<Integer>output)
    {
        if(root==null) return;
        for(int i=0;i<root.children.size();i++)
        {
            helper(root.children.get(i),output);
        }
        output.add(root.val);
    }
}