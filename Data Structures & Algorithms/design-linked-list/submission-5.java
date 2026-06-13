class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        super();
        head = null;
        tail = null;
        size = 0;
    }

    public void printList(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.val+"->");
            currentNode = currentNode.next;
        }
        System.out.println("null");

    }

    public int get(int index) {
        int val = -1;
        if ((head != null) && (index < size)) {
            Node current = head;
            int indexCount = 0;
            while (current != null) {
                if (indexCount == index) {
                    val = current.val;
                    break;
                }
                indexCount++;
                current = current.next;
            }
        }
        return val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (tail != null) {
            newNode.prev = tail;
            tail.next = newNode;
        } else {
            head = tail;
        }
        tail = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        } else if (index == size) {
            addAtTail(val);
        } else if (index == 0) {
            addAtHead(val);
        } else {
            Node newNode = new Node(val);
            Node currentNode = head;
            int currentIndex = 0;
            while (currentNode != null) {
                if (currentIndex == index) {
                    // set pervious and next for the new node.
                    newNode.next = currentNode;
                    newNode.prev = currentNode.prev;

                    // Update previous and current node next,prev field
                    currentNode.prev.next = newNode;
                    currentNode.prev = newNode;
                }
                currentNode = currentNode.next;
                currentIndex++;
            }
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index > size || index < 0 || index == size) {
            return;
        } else if (index == 1) {
            head = head.next;
            head.prev = null;
            size--;
        } else if (index == (size-1)) {
            tail.prev.next = null;
            tail = tail.prev;
            size--;
        } else {
            Node currentNode = head;
            int currentIndex = 0;
            while (currentNode != null) {
                if (currentIndex == index) {
                    currentNode.prev.next = currentNode.next;
                    currentNode.next.prev = currentNode.prev;
                    size--;
                    return;
                }
                currentIndex++;
                currentNode = currentNode.next;
            }
        }
    }
}

class Node {
    Node prev;
    int val;
    Node next;
    public Node(){
        super();
    }
    public Node(int val){
        this.val = val;
    }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */