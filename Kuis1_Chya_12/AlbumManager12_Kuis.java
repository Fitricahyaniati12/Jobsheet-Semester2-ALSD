import java.util.Scanner;

public class AlbumManager12_Kuis {
    Album12_kuis[] albums;
    Scanner input12 = new Scanner(System.in);

    public AlbumManager12_Kuis(int n) {
        albums = new Album12_kuis[n];
    }

    // Method tambahAlbum()
    public void tambahAlbum(int index) {
        System.out.println("Masukkan data album ke-" + (index + 1));
        System.out.print("Judul: ");
        String judul = input12.nextLine();
        System.out.print("Penyanyi: ");
        String penyanyi = input12.nextLine();
        System.out.print("Jumlah: ");
        int jumlah = input12.nextInt();
        System.out.print("Harga: ");
        int harga = input12.nextInt();

        // Memasukkan data album ke dalam AlbumManager
        albums[index] = new Album12_kuis(judul, penyanyi, jumlah, harga);
        input12.nextLine(); 
    }

    // Method cariAlbumTerlaris()
    public void cariAlbumTerlaris() {
        int max = albums[0].jumlah;
        int index = 0;
        for (int i = 1; i < albums.length; i++) {
            if (albums[i].jumlah > max) {
                max = albums[i].jumlah;
                index = i;
            }
        }
        System.out.println("Album terlaris adalah:");
        albums[index].tampil();
    }

    // Method daftarAlbum()
    public void daftarAlbum() {
        System.out.println("Daftar Album:");
        for (Album12_kuis album : albums) {
            album.tampil();
        }
    }

    // Method hitungTotalPenjualan()
    public int hitungTotalPenjualan() {
        int total = 0;
        for (Album12_kuis album : albums) {
            total += album.hitungpenjualan();
        }
        return total;
    }
}
