public class Node
{
    public Node next = null;
    public Node prev = null;
    public int val;
    public int key;
    public Node(int val,int key)
    {
        this.val=val;
        this.key=key;
    }
}

public class LRUCache {

    Dictionary<int,Node> cache =null;
    Node head=null;
    Node tail=null;
    int capacity=0;

    public LRUCache(int capacity) {
        cache= new Dictionary<int,Node>();
        this.capacity=capacity;
    }
    
    public int Get(int key) {
        if(cache.ContainsKey(key))
        {
            Node fetchedNode = cache[key];
            RePositionNode(fetchedNode);
            return fetchedNode.val;
        }

        return -1;
    }
    
    public void Put(int key, int value) {
        
        if(!cache.ContainsKey(key))
        {
            Node newNode = new Node(value,key);
            if(head ==null && tail==null)
            {
                head = newNode;
                tail = head;     
            }
            else
            {
                Node tempTailNode = tail;
                tail.next=newNode;
                tail=tail.next;  
                tail.prev=tempTailNode;          
            }

            cache.Add(key,newNode);

        }
        else
        {
            Node fetchedNode = cache[key];

            RePositionNode(fetchedNode);

            fetchedNode.val=value;
            cache[key] = fetchedNode;

            
        }

        if(cache.Count > capacity)
        {
            Node tempHead=head;
            head=head.next;
            tempHead.next=null;
            head.prev=null;
            
            cache.Remove(tempHead.key);
        }

    }

    private void RePositionNode(Node fetchedNode)
    {
        if(fetchedNode.next!=null) // if null, means its a tail node. No need to reposition to tail
        {
            if(fetchedNode.prev!=null)
            {
                Node fPrevNode = fetchedNode.prev;
                fPrevNode.next = fetchedNode.next;
                fetchedNode.next.prev=fPrevNode;
            }
            else if(fetchedNode.prev==null) // This is head
            {
                fetchedNode.next.prev=null;
                head=head.next;
            }

            tail.next=fetchedNode;
            fetchedNode.prev=tail;
            tail=tail.next;
            tail.next=null;

         }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.Get(key);
 * obj.Put(key,value);
 */