import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 5; // Banyaknya album

        AlbumManager12_Kuis albumManager = new AlbumManager12_Kuis(n);

        for (int i = 0; i < n; i++) {
            albumManager.tambahAlbum(i);
        }

        // Menampilkan daftar album
        albumManager.daftarAlbum();

        // Menghitung total penjualan
        int totalPenjualan = albumManager.hitungTotalPenjualan();
        System.out.println("Total penjualan: " + totalPenjualan);

        // Mencari album terlaris
        albumManager.cariAlbumTerlaris();

        input.close();
    }
}
