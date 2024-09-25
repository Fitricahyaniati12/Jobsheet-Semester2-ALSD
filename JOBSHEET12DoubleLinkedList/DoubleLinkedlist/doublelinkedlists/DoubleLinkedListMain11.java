public class DoubleLinkedListMain11 {
    public static void main(String[] args) {
        DoubleLinkedLists11 dll = new DoubleLinkedLists11();
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("=====================================");
        dll.addFirst(20);
        dll.addFirst(10);
        dll.addFirst(40);
        dll.addFirst(50);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("=====================================");
        try {
            dll.removeFirst();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("=====================================");
        try {
            dll.removeLast();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("=====================================");
        try {
            dll.remove(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size: " + dll.size());
    }
}
