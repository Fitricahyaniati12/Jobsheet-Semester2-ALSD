import java.util.Scanner;

public class KasirArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data kasir: ");
        int jumlahDataKasir = sc.nextInt();

        Kasir[] kasirArray = new Kasir[jumlahDataKasir];


        for (int i = 0; i < jumlahDataKasir; i++) {
            Kasir kasir = new Kasir();
            System.out.println("Masukkan data kasir ke-" + (i + 1));

            System.out.print("Choice: ");
            kasir.choice = sc.nextInt();

            System.out.print("Quit (true/false): ");
            kasir.quit = sc.nextBoolean();

            System.out.print("Price: ");
            kasir.price = sc.nextInt();

            System.out.println("Price_Item (3 integers separated by space): ");
            kasir.price_item = new int[3];
            for (int j = 0; j < 3; j++) {
                kasir.price_item[j] = sc.nextInt();
            }

            sc.nextLine(); // consume newline

            System.out.print("Menu: ");
            kasir.menu = sc.nextLine();

            System.out.print("Selected: ");
            kasir.selected = sc.nextLine();

            System.out.print("Total: ");
            kasir.total = sc.nextInt();

            System.out.print("Input_Item: ");
            kasir.input_item = sc.nextInt();

            System.out.print("Amount: ");
            kasir.amount = sc.nextInt();

            System.out.print("Paying: ");
            kasir.paying = sc.nextInt();

            System.out.print("Medicinedetail: ");
            kasir.MedicineDetail = sc.nextInt();

            System.out.print("Methodpayment: ");
            kasir.methodPayment = sc.nextInt();

            System.out.print("Assurancetype: ");
            kasir.assuranceType = sc.nextInt();

            System.out.print("Discount: ");
            kasir.Discon = sc.nextDouble();

            System.out.print("Discountpercentage: ");
            kasir.discountPercetage = sc.nextDouble();

            System.out.print("Totharga: ");
            kasir.totHarga = sc.nextInt();

            System.out.print("Totdiscount: ");
            kasir.totDisount = sc.nextDouble();

            System.out.print("Pembayaran: ");
            kasir.pembayaran = sc.nextInt();

            System.out.print("Change: ");
            kasir.change = sc.nextDouble();

            kasirArray[i] = kasir;
        }

        for (int i = 0; i < jumlahDataKasir; i++) {
            System.out.println("Data Kasir ke-" + (i + 1));
            kasirArray[i].tampilkanData();
            System.out.println();
        }

        sc.close();
    }
}
