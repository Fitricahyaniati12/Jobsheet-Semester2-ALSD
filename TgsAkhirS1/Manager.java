import java.util.Scanner;

public class Manager {
    private int jumlahKasir;
    private int jumlahBulan;
    private String[] namaKasir;
    private double[][] totalPendapatan;
    private double[] pendapatanKasir;
    private Scanner scanner;

    public Manager(int jumlahKasir, int jumlahBulan) {
        this.jumlahKasir = jumlahKasir;
        this.jumlahBulan = jumlahBulan;
        this.namaKasir = new String[jumlahKasir];
        this.totalPendapatan = new double[jumlahKasir][jumlahBulan];
        this.pendapatanKasir = new double[jumlahKasir];
        this.scanner = new Scanner(System.in);
    }

    public void tampilanManager() {
        System.out.println("Manager's Dashboard:");
        System.out.println("1. View Reports");
        System.out.println("2. Provide Feedback");
        System.out.println("3. Exit");
    }

    public void reportValue() {
        System.out.println("Sales Report:");

        for (int i = 0; i < jumlahKasir; i++) {
            System.out.println("Sales for Cashier " + namaKasir[i] + ":");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.println("Month " + (j + 1) + ": $" + totalPendapatan[i][j]);
            }
            System.out.println("Total Sales: $" + pendapatanKasir[i]);
            System.out.println();
        }
    }

    public void feedbackInput() {
        System.out.println("Provide Feedback for Each Cashier:");
        for (int i = 0; i < jumlahKasir; i++) {
            System.out.print("Enter feedback for Cashier " + namaKasir[i] + ": ");
            String feedback = scanner.nextLine();
            // Here you can store the feedback for each cashier as needed
        }
        System.out.println("Feedback recorded successfully.");
    }

    public void run() {
        tampilanManager();
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        switch (choice) {
            case 1:
                reportValue();
                break;
            case 2:
                feedbackInput();
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}
