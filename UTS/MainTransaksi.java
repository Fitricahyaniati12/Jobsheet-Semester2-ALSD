import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainTransaksi {
    public static void main(String[] args) {
        // Contoh penggunaan
        ArrayList<Rekening11> rekeningList = new ArrayList<>();
        ArrayList<Transaksi> transaksiList = new ArrayList<>();

        // Memasukkan data rekening
        Rekening11 rekening1 = new Rekening11("123456789", "cya", "cahya", "082241562699", "cya.14@gmail.com");
        Rekening11 rekening2 = new Rekening11("987654321", "dina", "ita", "082217624253", "dina.01@gmail.com");
        Rekening11 rekening3 = new Rekening11("002637288", "Zahra", "Widya", "081342879645", "Zahra.14@gmail.com");
        rekeningList.add(rekening1);
        rekeningList.add(rekening2);
        rekeningList.add(rekening3);

        // Memasukkan data transaksi
        Transaksi transaksi1 = new Transaksi(1000.0, 500.0, 1500.0, "2024-04-16", "Deposit");
        Transaksi transaksi2 = new Transaksi(2000.0, 1500.0, 3500.0, "2024-04-17", "Deposit");
        Transaksi transaksi3 = new Transaksi(4000.0, 1000.0, 5500.0, "2024-03-01", "Deposit");
        transaksiList.add(transaksi1);
        transaksiList.add(transaksi2);
        transaksiList.add(transaksi3);

        // Menampilkan data rekening
        System.out.println("Data Rekening:");
        for (Rekening11 rekening : rekeningList) {
            System.out.println(rekening);
            System.out.println();
        }

        // Menampilkan data transaksi
        System.out.println("Data Transaksi:");
        for (Transaksi transaksi : transaksiList) {
            System.out.println(transaksi);
            System.out.println();
        }

        // Mengurutkan data transaksi berdasarkan saldo
        Collections.sort(transaksiList, Comparator.comparing(Transaksi::getSaldo));

        // Menampilkan data transaksi setelah diurutkan
        System.out.println("Data Transaksi setelah diurutkan berdasarkan saldo:");
        for (Transaksi transaksi : transaksiList) {
            System.out.println(transaksi);
            System.out.println();
        }

        // Mencari data transaksi berdasarkan tanggal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tanggal transaksi yang ingin dicari (format: yyyy-MM-dd): ");
        String tanggalCari = scanner.nextLine();
        System.out.println("Hasil Pencarian:");
        for (Transaksi transaksi : transaksiList) {
            if (transaksi.getTanggalTransaksi().equals(tanggalCari)) {
                System.out.println(transaksi);
                System.out.println();
            }
        }
        scanner.close();
    }
}
