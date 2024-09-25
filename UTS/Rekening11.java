// Rekening.java
public class Rekening11 {
    private String noRekening;
    private String nama;
    private String namaIbu;
    private String phone;
    private String email;

    public Rekening(String noRekening, String nama, String namaIbu, String phone, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.phone = phone;
        this.email = email;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNama() {
        return nama;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "No Rekening: " + noRekening +
                "\nNama: " + nama +
                "\nNama Ibu: " + namaIbu +
                "\nPhone: " + phone +
                "\nEmail: " + email;
    }
}
