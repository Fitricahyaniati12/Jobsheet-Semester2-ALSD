import java.util.Scanner;

public class praktikumpemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==================");

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Cek apakah nilai berada dalam rentang 0-100
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            // Hitung nilai akhir
            double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.4 * nilaiUAS;

            // Cetak nilai akhir
            System.out.println("Nilai akhir: " + nilaiAkhir);

            // Konversi nilai akhir menjadi nilai huruf
                String nilaiHuruf;
                if (nilaiAkhir >= 80) {
                    nilaiHuruf = "A";
                } else if (nilaiAkhir >= 75) {
                    nilaiHuruf = "B+";
                } else if (nilaiAkhir >= 70) {
                    nilaiHuruf = "B";
                } else if (nilaiAkhir >= 65) {
                    nilaiHuruf = "C+";
                } else if (nilaiAkhir >= 60) {
                    nilaiHuruf = "C";
                } else if (nilaiAkhir >= 55) {
                    nilaiHuruf = "D";
                } else {
                    nilaiHuruf = "E";
                }

            // Menentukan apakah mahasiswa lulus atau tidak
                String keterangan;
                if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                    keterangan = "SELAMAT ANDA LULUS";
                } else {
                    keterangan = "TIDAK LULUS";
                }
                
                System.out.println("Nilai huruf: " + nilaiHuruf);
                System.out.println("Keterangan: " + keterangan);

                        }
                    }
                }
