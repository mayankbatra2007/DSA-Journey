package LinkedList;

public class linkedlist02 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // 1. create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // 2. newNode next = head
        newNode.next = head;
        // 3. make newNode head
        head = newNode;
    } // tc -> O(1)

    public void addLast(int data){
        // 1. create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // 2. tail.next -> newNode
        tail.next = newNode;
        // 3. tail -> newNode
        tail = newNode;
    } // tc -> O(1)
    public void print(){
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ->  ");
            temp = temp.next;
        }
        System.out.println("null");
    } // tc -> O(N)
    public void add(int idx, int data){// add in Middle
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }// tc -> O(1)
    public int removeFirst(){
        if(size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = tail.data;
        Node prev = head;
        for(int i = 0; i < size-2; i++){
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head == null) return -1;
        if(head.data == key) return 0;
        int idx = helper(head.next, key);
        if(idx == -1) return -1;
        return idx + 1;
    }// tc -> O(N) sc -> O(N)
    public int recSearch(int key){
        return helper(head, key);
    }
    public void reverse(Node head){
        
    }
    public static void main(String[] args) {
        linkedlist02 ll = new linkedlist02();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(2,99);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        int ans = ll.itrSearch(3);
        System.out.println(ans);
        System.out.println(size);
    }
}
