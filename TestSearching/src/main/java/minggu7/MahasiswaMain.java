package minggu7;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args ) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        PencarianMhs data = new PencarianMhs();
        int jumMHs = 5;
        
        System.out.println("----------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari Nim terkecil");
        for (int i = 0; i < jumMHs; i++ ) {
            System.out.println("------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);   
        }
        System.out.println("-------------------------------------");
        System.out.println("Data keseluruhan mahasiswa : ");
        data.tampil();
        
        System.out.println("-------------------");
        System.out.println("===================");
        System.out.println("Pencarian Data : ");
        System.out.println("Menggunakan binary search");
        System.out.println("Masukkan nama mahasiswa yang dicari: ");
        String cari = s.nextLine();
        int posisi = data.FindBinarySearch(cari, 0, jumMHs - 1);
        data.tampilHasilPencarian(cari, posisi);
    }
}
