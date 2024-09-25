public class Hotel {
    private String nama;
    private String kota;
    private int harga;
    private byte bintang;

    public Hotel(String nama, String kota, int harga, byte bintang) {
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }

    public String getNama() {
        return nama;
    }

    public String getKota() {
        return kota;
    }

    public int getHarga() {
        return harga;
    }

    public byte getBintang() {
        return bintang;
    }
}
