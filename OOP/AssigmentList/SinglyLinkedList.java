public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() { 
                head = null;
    }  
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(){
        Node temp = head;
        while(temp.next.next != null)
           temp = temp.next;
           temp.next = null;
    }   
    public void printValues(){
       Node temp = head; 
    while (temp != null) {
    System.out.println(temp.value);
    temp = temp.next;   
    }
}
}