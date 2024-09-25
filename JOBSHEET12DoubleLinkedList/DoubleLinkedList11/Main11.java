public class Main11 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        
        System.out.println("Linked list is empty");
        System.out.println("Size: " + dll.size());
        System.out.println("===================");

        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("successfully added");
        System.out.println("Size: " + dll.size());
        System.out.println("==================");

        dll.add(40, 1);
        dll.print();
        System.out.println("successfully added");
        System.out.println("Size: " + dll.size());
        System.out.println("==================");

        System.out.println("Data in the head of linked list is: " + dll.getFirst());
        System.out.println("Data in the tail of linked list is: " + dll.getLast());
        System.out.println("Data in the 1st index linked list is: " + dll.get(1));
    }
}
