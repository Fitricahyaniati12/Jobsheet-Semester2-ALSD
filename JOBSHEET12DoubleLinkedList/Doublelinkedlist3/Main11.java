import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();

        while (true) {
            System.out.println("===========================================");
            System.out.println("Data manipulation with Double Linked List");
            System.out.println("===========================================");
            System.out.println("1. Add First");
            System.out.println("2. Add Tail");
            System.out.println("3. Add Data in nth index");
            System.out.println("4. Remove First");
            System.out.println("5. Remove Last");
            System.out.println("6. Remove Data by index");
            System.out.println("7. Print");
            System.out.println("8. Search Data");
            System.out.println("9. Sort Data");
            System.out.println("10. Exit");
            System.out.println("===========================================");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Insert data in Head position");
                    int data1 = scanner.nextInt();
                    list.addFirst(data1);
                    break;
                case 2:
                    System.out.println("Insert data in Tail position");
                    int data2 = scanner.nextInt();
                    list.addLast(data2);
                    break;
                case 3:
                    System.out.println("Insert data");
                    System.out.print("Data Node: ");
                    int data3 = scanner.nextInt();
                    System.out.print("In index: ");
                    int index = scanner.nextInt();
                    list.addAtIndex(data3, index);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.println("Enter index to remove data: ");
                    int removeIndex = scanner.nextInt();
                    list.removeAtIndex(removeIndex);
                    break;
                    case 7:
                    System.out.println("Print data:");
                    if (list.isEmpty()) {
                        System.out.println("List is empty");
                    } else {
                        list.printList();
                    }
                    break;
                case 8:
                    System.out.print("Enter data to search: ");
                    int searchData = scanner.nextInt();
                    int result = list.search(searchData);
                    if (result != -1) {
                        System.out.println("Data " + searchData + " is at index: " + result);
                    } else {
                        System.out.println("Data " + searchData + " not found");
                    }
                    break;
                case 9:
                    list.sortDescending();
                    break;
                case 10:
                    System.out.println("Exiting program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please enter again");
            }
        }
    }
}
