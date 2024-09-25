import java.util.Scanner;

public class Platnomor12 {
    public static void main(String[] args) {
        // Array kode plat mobil
        String[] KODE = {"B", "AG", "T", "Z", "N", "R", "A", "DE", "DC", };
        // Array nama kota yang berpasangan dengan kode plat mobil
        String[][] KOTA = {
            {"Jakarta", "Bogor", "Depok", "Tangerang", "Bekasi"},
            {"Tulungagung", "Kediri", "Blitar", "Trenggalek", "Nganjuk"},
            {"Subang", "Karawang", "Purwakarta"},
            {"Banjar", "Garut", "Ciamis", "Tasikmalaya", "Sumedang"},
            {"Malang", "Probolinggo", "Batu", "Pasuruan", "Lumajang"},
            {"Banten", "Serang", "Pandeglang", "Tangerang", "Cilegon"},
            {"Gersik", "Sidoarjo"},
            {"Maluku", "Maluku Utara"},
            {" Sulawesi Barat "}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (huruf saja): ");
        String inputKode = scanner.next().toUpperCase(); 

        int index = -1;
        // Mencari indeks kode plat pada array KODE
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i].equalsIgnoreCase(inputKode)) { // Menggunakan equalsIgnoreCase untuk membandingkan string
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Kota yang berpasangan dengan kode plat " + inputKode + " adalah:");
            for (int i = 0; i < KOTA[index].length; i++) {
                System.out.println((i + 1) + ". " + KOTA[index][i]);
            }
        } else {
            System.out.println("Kode plat tidak valid atau tidak ditemukan.");
        }

        scanner.close();
    }
}
