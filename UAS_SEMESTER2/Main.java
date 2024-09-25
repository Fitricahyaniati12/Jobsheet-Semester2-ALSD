import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<RentalItem11> rentalItems = new ArrayList<>();
    private static List<RentalTransaction11> rentalTransactions = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("++++++++++++++++++");
                    System.out.println("Daftar transaksi peminjaman rental serba serbi");
                    System.out.println("++++++++++++++++++");
                    addRentalItem(scanner);
                    break;
                case "2":
                    makeTransaction(scanner);
                    System.out.println("----------------------");
                    System.out.println("Masukkan data pinjaman");
                    System.out.println("----------------------");
                    break;
                case "3":
                    displayTransactions();
                    break;
                case "4":
                    sortTransactionsByTNKB();
                    System.out.println("++++++++++++++++++");
                    System.out.println("Daftar transaksi peminjaman rental serba serbi");
                    System.out.println("++++++++++++++++++");
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addRentalItem(Scanner scanner) {
        System.out.print("Enter TNKB Number: ");
        String TNKBNumber = scanner.nextLine();
        System.out.print("Enter Vehicle Name: ");
        String vehicleName = scanner.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String vehicleType = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Rental Fee per Hour: ");
        int rentalFee = Integer.parseInt(scanner.nextLine());

        rentalItems.add(new RentalItem11(TNKBNumber, vehicleName, vehicleType, year, rentalFee));
        System.out.println("Rental item added successfully!");
    }

    private static void makeTransaction(Scanner scanner) {
        System.out.print("Enter Borrower Name: ");
        String borrowerName = scanner.nextLine();
        System.out.print("Enter TNKB Number: ");
        String TNKBNumber = scanner.nextLine();
        System.out.print("Enter Length of Loan (in hours): ");
        int lengthOfLoan = Integer.parseInt(scanner.nextLine());

        boolean borrowed = rentalTransactions.stream()
                .anyMatch(trans -> trans.getTNKBNumber().equals(TNKBNumber));
        if (borrowed) {
            System.out.println("Vehicle has been borrowed by someone else.");
            return;
        }

        boolean vehicleExists = rentalItems.stream()
                .anyMatch(item -> item.getTNKBNumber().equals(TNKBNumber));
        if (!vehicleExists) {
            System.out.println("Vehicle does not exist.");
            return;
        }

        RentalTransaction11 transaction = new RentalTransaction11(borrowerName, TNKBNumber, lengthOfLoan, rentalItems);
        rentalTransactions.add(transaction);
        System.out.println("Transaction completed! Total cost: " + transaction.getTotalCost());
    }

    private static void displayTransactions() {
        System.out.println("Daftar Transaksi Peminjaman Rental Serba Serbi");
        System.out.printf("| %-10s | %-15s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", 
                          "Kode", "Nama Barang", "No TNKB", "Nama Peminjam", "Lama Pinjam", "Total Biaya");

        for (RentalTransaction11 trans : rentalTransactions) {
            System.out.printf("| %-10d | %-15s | %-10s | %-10s | %-10d | %-10.2f |\n", 
                              trans.getTransactionCode(), 
                              trans.getVehicleName(rentalItems), 
                              trans.getTNKBNumber(), 
                              trans.getBorrowerName(), 
                              trans.getLengthOfLoan(), 
                              trans.getTotalCost());
        }

        double totalIncome = rentalTransactions.stream()
                                               .mapToDouble(RentalTransaction11::getTotalCost)
                                               .sum();
        System.out.println("TOTAL PENDAPATAN RENTAL SERBA SERBI");
        System.out.printf("Pendapatan hari ini: %.2f\n", totalIncome);
    }

    private static void sortTransactionsByTNKB() {
        rentalTransactions.sort((t1, t2) -> t2.getTNKBNumber().compareTo(t1.getTNKBNumber()));
        for (RentalTransaction11 trans : rentalTransactions) {
            System.out.println(trans);
        }
    }
}
