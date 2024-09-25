public class DoubleLinkedList {
    private Node11 head;
    private Node11 tail;
    private int size;

    // Constructor
    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to add data to the beginning of the list
    public void addFirst(int data) {
        Node11 newNode = new Node11(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Method to add data to the end of the list
    public void addLast(int data) {
        Node11 newNode = new Node11(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
       // System.out.println("successfully added");
    }

    // Method to add data at a specific index
    public void add(int data, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Invalid index");
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node11 newNode = new Node11(data);
            Node11 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    // Method to get the data from the first node
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is empty");
        }
        return head.data;
    }

    // Method to get the data from the last node
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is empty");
        }
        return tail.data;
    }

    // Method to get the data at a specific index
    public int get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is empty");
        }
        if (index < 0 || index >= size) {
            throw new Exception("Invalid index");
        }
        Node11 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Method to print the elements of the list
    public void print() {
        Node11 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
            if(current != null) {
                System.out.print("   "); // Add spacing between numbers
            }
        }
        System.out.println();
    }

    // Method to get the size of the list
    public int size() {
        return size;
    }
}
