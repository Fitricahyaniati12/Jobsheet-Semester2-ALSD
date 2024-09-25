public class DoubleLinkedList {
    private Node11 head;
    private Node11 tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    

    public void addFirst(int data) {
        Node11 newNode = new Node11(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node11 newNode = new Node11(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtIndex(int data, int index) {
        if (index < 0) {
            System.out.println("Index cannot be negative");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node11 newNode = new Node11(data);
        Node11 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    public void removeAtIndex(int index) {
        if (index < 0) {
            System.out.println("Index cannot be negative");
            return;
        }

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node11 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }

        if (current == tail) {
            removeLast();
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    public void printList() {
        Node11 current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    

    public int search(int data) {
        Node11 current = head;
        int index = 0;
        while (current != null) {
            if (current.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void sortDescending() {
        Node11 current = head;
        while (current != null) {
            Node11 index = current.next;
            while (index != null) {
                if (current.data < index.data) {
                    int temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }
}