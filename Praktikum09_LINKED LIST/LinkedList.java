/**
 * LinkedList
 */
public class LinkedList {
    Node head;

    public boolean isEmpty(){
        return (head == null);
    }

    public void print (){
        if (!isEmpty()){
            System.out.print("Isi linked list: ");
            Node currentNode = head;
            
            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
                
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input){
        Node newNode = new Node(input, null);

        if (isEmpty()){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input){
        Node newNode = new Node(input, null);

        if (isEmpty()){
            head = newNode;
        } else {
            Node currentNode = head;
           
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                
            }
            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input){
        Node newNode = new Node(input, null);

        if (!isEmpty()){
            Node currentNode = head;
 
            while (currentNode != null) {
                if (currentNode.data == key){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            }
        } else {
            System.out.print("Linked list kosong");
        }
    }

    public void insertBefore(int key, int input) {
        Node newNode = new Node(input, null);

        if (!isEmpty()) {
            if (head.data == key) {
                addFirst(input);
                return;
            }

            Node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    return;
                }
                currentNode = currentNode.next;
            }
        }

        System.out.println("Keyword tidak ditemukan");
    }

    public void insertAt(int index, int key) {
        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            addFirst(key);
            return;
        }

        Node newNode = new Node(key, null);
        Node currentNode = head;
        int currentIndex = 0;

        while (currentNode != null && currentIndex < index - 1) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        if (currentNode == null) {
            System.out.println("Index melebihi ukuran linked list");
            return;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void removeFirst(){
        if (!isEmpty()){
            head = head.next;
        } else {
            System.out.println("Linked list masih kosong");
        }
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked list masih kosong");
        } else if (head.next == null){
            head = null;
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;       
            }
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
        } else if (head.data == key){
            removeFirst();
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key){
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node currentNode = head;
        int currentIndex = 0;

        while (currentNode != null && currentIndex < index - 1) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        if (currentNode == null || currentNode.next == null) {
            System.out.println("Index melebihi ukuran linked list");
            return;
        }

        currentNode.next = currentNode.next.next;
    }
}
