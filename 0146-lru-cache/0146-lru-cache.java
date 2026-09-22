class LRUCache {

    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }

    private int capacity;
    private Map<Integer,Node> map;

    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map=new HashMap<>();

        head=new Node(0,0);
        tail=new Node(0,0);

        head.next=tail;
        tail.prev=head;      
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node node = map.get(key);
        remove(node);
        addAtHead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(!map.containsKey(key)){
            //check capacity if full then remove lru node
            if(map.size()>=capacity){
                Node lruNode = tail.prev;
                remove(lruNode);
                map.remove(lruNode.key);
            }

            Node newNode = new Node(key,value);
            addAtHead(newNode);
            map.put(key,newNode);
        }else{
            Node temp=map.get(key);
            remove(temp);
            temp.val=value;
            addAtHead(temp);
        }
    }

    public void remove(Node node){
        Node prevNode=node.prev;
        Node nextNode=node.next;

        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }

    public void addAtHead(Node node){
        Node mruNode=head.next;

        node.next=mruNode;
        node.prev=head;

        head.next=node;
        mruNode.prev=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */