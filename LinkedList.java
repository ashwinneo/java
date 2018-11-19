import java.util.HashSet;

class LinkedList 
{ 
    Node head;  // head of list 
  
    /* Linked list Node*/
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Inserts a new Node at front of the list. */
    public void push(int new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
  
        /* 3. Make next of new Node as head */
        new_node.next = head; 
  
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 


    void insertMiddle(int new_data, Node previous_node) {
        Node new_node = new Node(new_data);

        if(previous_node == null) {
            System.out.println("You need to have a previous node");
        }

        new_node.next = previous_node.next;
        previous_node.next = new_node;

    }

    void insertLast(int new_data) {
        Node new_node = new Node(new_data);

        new_node.next = null;

        Node temp = head;

        while(temp !=null && temp.next !=null) {
            temp = temp.next;
        }

        temp.next = new_node;
    }
  
    /* Given a reference (pointer to pointer) to the head of a list 
       and a position, deletes the node at the given position */
    void deleteNode(int position) 
    { 
        // If linked list is empty 
        if (head == null) 
            return; 
  
        // Store head node 
        Node temp = head; 
  
        // If head needs to be removed 
        if (position == 0) 
        { 
            head = temp.next;   // Change head 
            return; 
        } 
  
        for(int i=0; temp!=null && i<position-1;i++) {
            temp = temp.next;
        }

        Node next = temp.next.next;

        temp.next = next;
    } 
  
    public int getCount() {
        Node temp = head;
        int count = 0;
        while(temp != null && temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int getCount(Node node) {

        if(node == null) {
            return 0;
        }

        return 1 + getCount(node.next);
    }

    public int getCountReursive() {
        return getCount(head);
    } 

    public boolean searchNode(Node head, int key) {

        Node temp = head;

        while(temp != null && temp.next != null) {
            if(temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Node reverseLinkList(Node node) {
        Node previous = null;
        Node current = node;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        node = previous;

        return node;
    }

    public boolean detectLoop(Node head) {

        // Node temp = head;

        // HashSet<Node> set = new HashSet<Node>();

        // while(temp != null) {

        //     if(set.contains(temp)) {
        //         return true;
        //     }
        //     set.add(temp);
        //     temp = temp.next;
        // }
        // return false;

        Node sp = head;
        Node fp = head;

        while(sp !=null && fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;

            if(sp == fp) {
                return true;

            }
        }
        return false;

    }

    public int findMiddle() {
        Node sp = head;
        Node fp = head;

        while(sp !=null && fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
        }

        return sp.data;
    }

    public int getNthNode(int pos) {
        Node temp = head;
        int len = 0;
        while(temp != null && temp.next != null) {
            len++;
            temp = temp.next;
        }

        int nth = len-pos+1;
        temp = head;
        for(int i=0; i<nth; i++) {
            temp = temp.next;
        }

        return temp.data;
    }


    /* This function prints contents of linked list starting from 
        the given node */
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 

    public void printListNode(Node head) {
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" --> "); 
            tnode = tnode.next; 
        } 
    }
  
    /* Drier program to test above functions. Ideally this function 
       should be in a separate user class.  It is kept here to keep 
       code compact */
    public static void main(String[] args) 
    { 
        /* Start with the empty list */
        LinkedList llist = new LinkedList(); 
  
        llist.push(7); 
        llist.push(1); 
        llist.push(3); 
        llist.push(2); 
        llist.push(8); 
  
        //System.out.println("\nCreated Linked list is: "); 
        //llist.printList(); 
        //llist.insertMiddle(10,llist.head.next);
        //llist.insertLast(20);
        //llist.deleteNode(4);  // Delete node at position 4 
        
        //System.out.println("\nLinked List after Deletion at position 4: "); 
        //llist.printList();
        
        

        // int c = llist.getCount();
        // System.out.println(c);

        // System.out.println("Count Recursive is" + llist.getCountReursive());
        // System.out.println(llist.searchNode(llist.head, 8));

        // llist.head = llist.reverseLinkList(llist.head);
        // llist.printListNode(llist.head);

        // if(llist.detectLoop(llist.head)) {
        //     System.out.println("Loop Detected");
        // }else {
        //     System.out.println("Loop not Detected");
        // }

        // int new_node = llist.findMiddle();
        // System.out.println(new_node);  
        
        int k = llist.getNthNode(4);
        System.out.println(k);
    } 
} 