import java.util.Scanner;

public class Rumus12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===================");
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.println("===================");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            System.out.println("=============");

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }

    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (dalam kilometer): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (dalam jam): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;

        System.out.println("=======================");
        System.out.println("Kecepatan adalah: " + kecepatan + " km/jam");
    }

    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (dalam kilometer per jam): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (dalam jam): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.println("=======================");
        System.out.println("Jarak yang ditempuh adalah: " + jarak + " kilometer");
    }

    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (dalam kilometer): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (dalam kilometer per jam): ");
        double kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;

        System.out.println("=======================");
        System.out.println("Waktu yang diperlukan adalah: " + waktu + " jam");
    }
}
