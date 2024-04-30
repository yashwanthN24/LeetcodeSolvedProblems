// class MyLinkedList {
    
//     private class Node{
//         private int val ;
//         private Node next ; 

//         private Node(int value){
//             this.val = value ; 
//             this.next = null ; 
//         }
//     }

//     private Node head ; 
//     private Node Tail ;
//     private int  length ; 


//     public MyLinkedList() {
//         head = null ; 
//         Tail = null ;
//         length = 0 ; 
//     }
    
//     public int get(int index) {
//         if(index >= length || index < 0 ){
//             return -1 ; 
//         }

//         Node cur = head ;  
//         int i = 0 ; 
//         while(i < index ){
//             cur = cur.next ; 
//             i++;
//         }

//         return cur.val ; 
//     }
    
//     public void addAtHead(int val) {
//         Node newNode = new Node(val);
//         length++;
//         if(head == null){
//             head = Tail =  newNode ;
//             return ; 
//         }

//         newNode.next = head ; 
//         head = newNode ; 
//     }
    
//     public void addAtTail(int val) {
//         Node newNode = new Node(val);
//         length++;

//         if(head == null){
//             head = Tail = newNode ;
//             return ; 
//         }

//         Tail.next = newNode ; 
//         Tail = newNode ; 

//     }
    
//     public void addAtIndex(int index, int val) {
//         if(index > length  ){
//             System.out.println("Invalid index");
//             return ; 
//         }
//         if(index == length){
//             addAtTail(val);
//         }
//         if(index == 0 ){
//             addAtHead(val);
//         }
//         int i = 0 ; 
//         Node newNode = new Node(val);
//         length++;
//         Node cur = head ; 
//         while( i < index  -2  ){
//             cur = cur.next ; 
//             i++;
//         }

//         newNode.next = cur.next ; 
//         cur.next = newNode ; 

//     }
    
//     public void deleteAtIndex(int index) {
//         if(index >=length || index < 0 ){
//             return ;
//         }
//         if(index == 0){
//             head = head.next ; 
//             if(head == null )
//                 Tail = null ; 
//             length--;
//             return ; 
//         }


//         Node cur = head ; 
//         int i = 0 ; 
//         while(i < index-2){
//             cur = cur.next ; 
//             i++;
//         }
//         cur.next = cur.next.next ;
//         if(cur.next == null )
//             Tail = cur; 
//         length--; 
//     }
// }

// /**
//  * Your MyLinkedList object will be instantiated and called as such:
//  * MyLinkedList obj = new MyLinkedList();
//  * int param_1 = obj.get(index);
//  * obj.addAtHead(val);
//  * obj.addAtTail(val);
//  * obj.addAtIndex(index,val);
//  * obj.deleteAtIndex(index);
//  */







class ListNode {
    int val;
    ListNode next;
    
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    ListNode head;
    int size;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        ListNode newNode = new ListNode(val);
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        ListNode newNode = new ListNode(val);
        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            prev = curr;
            curr = curr.next;
        }
        newNode.next = curr;
        prev.next = newNode;
        size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        size--;
    }
}
