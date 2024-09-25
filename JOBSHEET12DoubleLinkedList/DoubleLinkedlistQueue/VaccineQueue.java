public class VaccineQueue {
    private Node11 front;
    private Node11 rear;
    private int size;

    public VaccineQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int queueNumber, String name) {
        Node11 newNode = new Node11(queueNumber, name);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }

    public Node11 dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        Node11 temp = front;
        if (front.next != null) {
            front = front.next;
            front.prev = null;
        } else {
            front = null;
            rear = null;
        }
        size--;
        return temp;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node11 current = front;
        System.out.println("Current vaccine queue:");
        System.out.println("| No. | Name");
        int count = 1;
        while (current != null) {
            System.out.println("| " + current.queueNumber + " | " + current.name);
            current = current.next;
            count++;
        }
        System.out.println("Queue left: " + size);
    }

    public int getSize() {
        return size;
    }
}
