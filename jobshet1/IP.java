 import java.util.Scanner;

public class IP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        // Input nilai untuk setiap mata kuliah
        double[] nilaiAngka = new double[8];
        String[] namaMataKuliah = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", 
                                    "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", 
                                    "Keselamatan dan Kesehatan Kerja"};

        for (int i = 0; i < 8; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + namaMataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
        }

        // Hitung IP Semester
        double[] bobotNilai = {3.5, 4.0, 3.0, 4.0, 4.0, 2.5, 2.5, 4.0};
        String[] nilaiHuruf = new String[8];
        
        System.out.println("================================");
        System.out.println("Hasil Konversi Nilai :");
        System.out.println("================================");
        System.out.printf("%-40s%-15s%-15s%-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        double totalBobotNilai = 0;
        double totalNilai = 0;
        for (int i = 0; i < 8; i++) {
            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
            double nilaiSetara = konversiNilaiSetara(nilaiAngka[i]);
            System.out.printf("%-40s%-15.2f%-15s%-15.2f\n", namaMataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalNilai += nilaiSetara * bobotNilai[i];
            totalBobotNilai += bobotNilai[i];
        }

        // Output IP Semester
        double ipSemester = totalNilai / totalBobotNilai;
        System.out.println("================================");
        System.out.println("IP : " + ipSemester);
    }

    // Metode untuk mengonversi nilai angka menjadi nilai huruf
    public static String konversiNilaiHuruf(double nilaiAngka) {
        if (nilaiAngka >= 85) {
            return "A";
        } else if (nilaiAngka >= 80) {
            return "A-";
        } else if (nilaiAngka >= 75) {
            return "B+";
        } else if (nilaiAngka >= 70) {
            return "B";
        } else if (nilaiAngka >= 65) {
            return "B-";
        } else if (nilaiAngka >= 60) {
            return "C+";
        } else if (nilaiAngka >= 50) {
            return "C";
        } else {
            return "E";
        }
    }

    // Metode untuk mengonversi nilai angka menjadi nilai setara
    public static double konversiNilaiSetara(double nilaiAngka) {
        if (nilaiAngka >= 85) {
            return 4.0;
        } else if (nilaiAngka >= 80) {
            return 3.5;
        } else if (nilaiAngka >= 75) {
            return 3.0;
        } else if (nilaiAngka >= 70) {
            return 2.5;
        } else if (nilaiAngka >= 65) {
            return 2.0;
        } else if (nilaiAngka >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}
