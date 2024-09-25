public class Album12_kuis {
    String judul;
    String penyanyi;
    int jumlah;
    int harga;

    // Constructor
    public Album12_kuis(String judul, String penyanyi, int jumlah, int harga) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Method tampil()
    public void tampil() {
        System.out.println("Judul: " + judul);
        System.out.println("Penyanyi: " + penyanyi);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
        System.out.println();
    }

    // Method hitungpenjualan()
    public int hitungpenjualan() {
        return jumlah * harga;
    }
}
