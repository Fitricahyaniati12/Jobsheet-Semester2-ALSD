import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack11 stack = new Stack11();

         //Add some books to the stack to match the desired output
        stack.push("Practical Digital Forensics");
        stack.push("Getting Started with C++ Audio Programming for Game Developers");
        stack.push("Algorithms Notes for Professionals");
        stack.push("Practical Digital Forensics");
        stack.push("Understanding Software");
        stack.push("3D Computer Vision");
        while (true) {
            System.out.println("********************************");
            System.out.println("Library data book");
            System.out.println("********************************");
            System.out.println("1. Add new book");
            System.out.println("2. Get book from top");
            System.out.println("3. Peek book title from top");
            System.out.println("4. Info all books");
            System.out.println("5. Exit");
            System.out.println("********************************");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("----------------------");
                    System.out.println("Insert new book title:");
                    System.out.println("----------------------");
                    String newBook = scanner.nextLine();
                    stack.push(newBook);
                    break;
                case 2:
                    String removedBook = stack.pop();
                    if (removedBook != null) {
                        System.out.println("----------------------");
                        System.out.println("Book on top has been removed: " + removedBook);
                        System.out.println("----------------------");
                    }
                    break;
                case 3:
                    String topBook = stack.peek();
                    if (topBook != null) {
                        System.out.println("----------------------");
                        System.out.println("Top book title: " + topBook);
                        System.out.println("----------------------");
                    }
                    break;
                case 4:
                    System.out.println("----------------------");
                    System.out.println("Info all books:");
                    System.out.println("----------------------");
                    stack.printStack();
                    break;
                case 5:
                    System.out.println("Exiting program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please enter again");
            }
        }
    }
}
