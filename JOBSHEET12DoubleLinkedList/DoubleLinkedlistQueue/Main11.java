import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VaccineQueue queue = new VaccineQueue();

        while (true) {
            System.out.println("+++++++++++++++++");
            System.out.println("Extravaganza Vaccine Queue");
            System.out.println("+++++++++++++++++");
            System.out.println("1. Add Vaccine queue");
            System.out.println("2. Remove Vaccine queue");
            System.out.println("3. Display vaccine queue");
            System.out.println("4. Exit");
            System.out.println("+++++++++++++++++");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Add new vaccine queue");
                    System.out.print("Queue number: ");
                    int queueNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    queue.enqueue(queueNumber, name);
                    break;
                case 2:
                    Node11 vaccinatedPerson = queue.dequeue();
                    if (vaccinatedPerson != null) {
                        System.out.println(vaccinatedPerson.name + " has been vaccinated!");
                    }
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Exiting program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please enter again");
            }
        }
    }
}
