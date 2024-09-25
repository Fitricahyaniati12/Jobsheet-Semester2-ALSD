public class Stack11 {
    private Node11 top;

    public Stack11() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(String data) {
        Node11 newNode = new Node11(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top.prev = newNode;
            top = newNode;
        }
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        String data = top.data;
        if (top.next != null) {
            top = top.next;
            top.prev = null;
        } else {
            top = null;
        }
        return data;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return top.data;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node11 current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
