public class MinStack {

    List<int> stack = null;
    List<int> minStack=null;
    int top=-1;
    public MinStack() {
        stack = new List<int>();
         minStack = new List<int>();
    }
    
    public void Push(int value) {
       
       int minValue=value;
        if(minStack.Count > 0 && minValue > minStack.Last())
        {
            minValue = minStack.Last();
        }
       
        stack.Add(value);
        minStack.Add(minValue);
        

        top++;
    }
    
    public void Pop() {
        if(stack.Count>0)
         stack.RemoveAt(top);

          if(minStack.Count>0)
          minStack.RemoveAt(top);
        if(top>=0)
        top--;
    }
    
    public int Top() {
        
        return stack.Last();
    }
    
    public int GetMin() {
        
        return minStack.Last();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.Push(value);
 * obj.Pop();
 * int param_3 = obj.Top();
 * int param_4 = obj.GetMin();
 */