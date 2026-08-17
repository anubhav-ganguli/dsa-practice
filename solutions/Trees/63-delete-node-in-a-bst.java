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
    public TreeNode DeleteNode(TreeNode root, int key) {
        
        if(root is null)
            return root;

        if(root.val < key)
        {
           root.right =  DeleteNode(root.right,key);
        }
        else  if(root.val > key)
        {
           root.left =  DeleteNode(root.left,key);
        }
        else
        {
            if(root.left is null)
                return root.right;
            if(root.right is null)
                return root.left;

            TreeNode rightMostChild = FindRightMostLowestChild(root.right);

            root.val = rightMostChild.val;
            root.right = DeleteNode(root.right,rightMostChild.val);

        }

        return root;

    }

    private TreeNode FindRightMostLowestChild(TreeNode node)
    {
        TreeNode curr = node;
        while(curr!=null && curr.left!=null)
        {
            curr=curr.left;
        }

        return curr;
    }
}