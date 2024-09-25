import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList11 studentList = new StudentList11();

        while (true) {
            System.out.println("Student Data Management System");
            System.out.println("1. Add data from head");
            System.out.println("2. Add data from tail");
            System.out.println("3. Add data in specific index");
            System.out.println("4. Remove data from head");
            System.out.println("5. Remove data from tail");
            System.out.println("6. Remove data in specific index");
            System.out.println("7. Print");
            System.out.println("8. Search by NIM");
            System.out.println("9. Sort by GPA - DESC");
            System.out.println("10. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Insert NIM in head position");
                    System.out.print("NIM: ");
                    String nimHead = scanner.nextLine();
                    System.out.print("Name: ");
                    String nameHead = scanner.nextLine();
                    System.out.print("GPA: ");
                    double gpaHead = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    studentList.addFromHead(nimHead, nameHead, gpaHead);
                    break;
                case 2:
                    System.out.println("Insert NIM in tail position");
                    System.out.print("NIM: ");
                    String nimTail = scanner.nextLine();
                    System.out.print("Name: ");
                    String nameTail = scanner.nextLine();
                    System.out.print("GPA: ");
                    double gpaTail = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    studentList.addFromTail(nimTail, nameTail, gpaTail);
                    break;
                    case 3:
                    System.out.println("Insert student's data node");
                    System.out.print("NIM: ");
                    String nimIndex = scanner.nextLine();
                    System.out.print("Name: ");
                    String nameIndex = scanner.nextLine();
                    System.out.print("GPA: ");
                    double gpaIndex = scanner.nextDouble();
                    System.out.print("In index: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (index < 0 || index > studentList.getSize()) {
                        System.out.println("Invalid index. Please enter a valid index.");
                    } else {
                        studentList.addAtIndex(nimIndex, nameIndex, gpaIndex, index);
                        System.out.println("Data inserted successfully at index " + index);
                    }
                    break;
                
                case 4:
                    studentList.removeFromHead();
                    break;
                case 5:
                    studentList.removeFromTail();
                    break;
                case 6:
                    System.out.print("Remove data at index: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    studentList.removeAtIndex(removeIndex);
                    break;
                case 7:
                    System.out.println("Printing data");
                    studentList.printList();
                    System.out.println("All data printed successfully");
                    break;
                case 8:
                    System.out.print("Insert NIM to be searched: ");
                    String searchNim = scanner.nextLine();
                    Student11 student = studentList.searchByNIM(searchNim);
                    if (student != null) {
                        System.out.println("Data " + searchNim + " is found");
                        System.out.println("NIM: " + student.nim);
                        System.out.println("Name: " + student.name);
                        System.out.println("GPA: " + student.gpa);
                    } else {
                        System.out.println("Data " + searchNim + " is not found");
                    }
                    break;
                case 9:
                    studentList.sortByGPADesc();
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
