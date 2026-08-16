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
    public IList<IList<int>> LevelOrder(TreeNode root) {
        if(root ==null)
          return [];
        Queue<TreeNode> queue = new Queue<TreeNode>();
        List<List<int>> result = new List<List<int>>();
        List<int> tempResult = new List<int>();
        List<TreeNode> level = new List<TreeNode>();
        List<TreeNode> tempLevel = new List<TreeNode>();
        queue.Enqueue(root);
        level.Add(root);
        while(queue.Count>0)
        {
            tempLevel.Clear();
            tempResult.Clear();
            while(level.Count>0)
            {
                TreeNode currNode= queue.Dequeue();
                tempResult.Add(currNode.val);
                level.Remove(currNode);
                if(currNode.left!=null)
                {
                    queue.Enqueue(currNode.left);
                    tempLevel.Add(currNode.left);
                }

                if(currNode.right!=null)
                {
                    queue.Enqueue(currNode.right);
                    tempLevel.Add(currNode.right);
                }
            }
            level.AddRange(tempLevel);
            result.Add([..tempResult]);
        }

        return result.Cast<IList<int>>().ToList();;

    }
}