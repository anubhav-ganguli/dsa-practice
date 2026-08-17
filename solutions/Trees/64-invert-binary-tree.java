/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public TreeNode InvertTree(TreeNode root) {

       return Helper(root);
        
    }

    private TreeNode Helper(TreeNode root)
    {
        if(root is null)
            return null;


        TreeNode temp = root.left;
        root.left=root.right;
        root.right=temp;

        Helper(root.left);
        Helper(root.right);

        return root;

    }
}