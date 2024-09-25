import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();

        Queue11 antrian = new Queue11(kapasitas);

        int pilihan;
        do {
            System.out.println("\nPilih Menu:");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Lihat Pasien Terdepan");
            System.out.println("4. Lihat Pasien Paling Belakang");
            System.out.println("5. Cari Posisi Pasien");
            System.out.println("6. Daftar Pasien");
            System.out.println("7. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\nNama Pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor ID: ");
                    int noID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jenisKelamin = sc.next().charAt(0);
                    sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    sc.nextLine();
                    Pasien pasienBaru = new Pasien(nama, noID, jenisKelamin, umur);
                    antrian.enqueue(pasienBaru);
                    System.out.println("Pasien " + nama + " telah ditambahkan ke antrian");
                    break;
                case 2:
                    Pasien pasienPanggil = antrian.dequeue();
                    if (pasienPanggil != null) {
                        System.out.println("Pasien yang dipanggil: " + pasienPanggil.nama);
                    }
                    break;
                case 3:
                    Pasien pasienTerdepan = antrian.peek();
                    if (pasienTerdepan != null) {
                        System.out.println("Pasien terdepan: " + pasienTerdepan.nama);
                    }
                    break;
                case 4:
                    Pasien pasienBelakang = antrian.peekRear();
                    if (pasienBelakang != null) {
                        System.out.println("Pasien paling belakang: " + pasienBelakang.nama);
                    }
                    break;
                case 5:
                    System.out.print("\nMasukkan nama pasien: ");
                    String namaCari = sc.nextLine();
                    int posisi = antrian.peekPosition(namaCari);
                    if (posisi != -1) {
                        System.out.println("Posisi antrian pasien " + namaCari + ": " + posisi);
                    } else {
                        System.out.println("Pasien " + namaCari + " tidak ditemukan dalam antrian");
                    }
                    break;
                case 6:
                    System.out.println("\nDaftar Pasien:");
                    antrian.daftarPasien();
                    break;
                case 7:
                    System.out.println("\nTerima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 7);

        sc.close();
    }
}
