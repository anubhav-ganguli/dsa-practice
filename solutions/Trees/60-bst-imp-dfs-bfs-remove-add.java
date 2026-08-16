 
    public static Tree AddNode(Tree root, int val)
    {
        if(root ==null)
            return new Tree(val);
        

        if(val > root.val)
           root.right= AddNode(root.right,val);
        else 
           root.left=  AddNode(root.left,val);
             
        return root;
    }
    
    public static void BFS(Tree root)
    {
        Queue<Tree> queue = new Queue<Tree>();
        
        queue.Enqueue(root);
        
        while(queue.Count>0)
        {
            Tree currNode= queue.Dequeue();
            Console.WriteLine(currNode.val);
            if(currNode.left!=null)
            {
                queue.Enqueue(currNode.left);
            }
            
            if(currNode.right!=null)
            {
                queue.Enqueue(currNode.right);
            }
        }
    }
    
    public static void DFS_Inorder(Tree root)
    {
        if(root is null)
            return;
            
        DFS_Inorder(root.left);
        Console.WriteLine(root.val);
        DFS_Inorder(root.right);
    }
    
     public static void DFS_Postorder(Tree root)
    {
        if(root is null)
            return;
            
        DFS_Postorder(root.left);
        DFS_Postorder(root.right);
        Console.WriteLine(root.val);
    }
    
     public static void DFS_Preorder(Tree root)
    {
        if(root is null)
            return;
            
        Console.WriteLine(root.val);
        DFS_Preorder(root.left);
        DFS_Preorder(root.right);
    }
    
    public static Tree DeleteNode(Tree root,int val)
    {
       if(root is null)
          return root;
          
       if(val > root.val)
        {
           root.right= DeleteNode(root.right,val);
        }
      else if(val < root.val)
        {
          root.left=  DeleteNode(root.left,val);
        }
        else
        {
            if(root.left is null)
               return root.right;
            if(root.right is null)
               return root.left;
             
            Tree rightMostLowestChild = GetRightMostLowestChild(root);
            
            root.val = rightMostLowestChild.val;
            
            root.right = DeleteNode(root.right,rightMostLowestChild.val);
            

        }
        
                    
            return root;
    }
    
    private static Tree GetRightMostLowestChild(Tree node)
    {
        Tree curr= node.right;
        while(curr!=null && curr.left!=null)
        {
            curr=curr.left;
        }
        
        return curr;
    }
    
    public class Tree
    {
        public Tree left;
        public Tree right;
        public  int val;
        
       public Tree()
        {
            
        }
        
       public Tree(int val)
        {
            this.val=val;
        }
    }
    