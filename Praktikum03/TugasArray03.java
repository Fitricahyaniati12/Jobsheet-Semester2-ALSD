import java.util.Scanner;

/**
 * TugasArray03
 */
public class TugasArray03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nama = new String[3];
        String[] nim = new String[3];
        char[] jenisKelamin = new char[3];
        double[] ipk = new double[3];
        double totalIpk = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            nama[i] = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            nim[i] = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            jenisKelamin[i] = scanner.nextLine().charAt(0);
            System.out.print("Masukkan IPK: ");
            ipk[i] = scanner.nextDouble();
            scanner.nextLine(); // Clear the buffer
            totalIpk += ipk[i];
        }

        System.out.println();
        int index = 1;
        for (String n : nama) {
            System.out.println("Data Mahasiswa ke-" + index++);
            System.out.println("Nama: " + n);
            System.out.println("NIM: " + nim[index - 2]);
            System.out.println("Jenis kelamin: " + jenisKelamin[index - 2]);
            System.out.println("Nilai IPK: " + ipk[index - 2]);
            System.out.println();
        }

        double rataRataIpk = totalIpk / 3;
        System.out.println("Rata-rata IPK: " + rataRataIpk);
    }
}
