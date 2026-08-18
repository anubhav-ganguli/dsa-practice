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
    public int MaxDepth(TreeNode root) {
        
       int l=0;
       return Helper(root,1,ref l);
    }

    private int Helper(TreeNode root,int level,ref int maxLevel)
    {
        if(root is null)
            return maxLevel;

        maxLevel=Math.Max(level,maxLevel);

        Helper(root.left,level+1,ref maxLevel);
        Helper(root.right,level+1,ref maxLevel);

        return maxLevel;
    }
    
}