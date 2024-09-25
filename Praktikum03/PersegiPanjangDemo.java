/**
 * PersegiPanjangDemo
 */
import java.util.Scanner;
public class PersegiPanjangDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];

        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang[i] = new PersegiPanjang();

            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            arrayOfPersegiPanjang[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            arrayOfPersegiPanjang[i].lebar = sc.nextInt();
        }
        System.out.println("Persegi panjang ke-1, panjang: " + arrayOfPersegiPanjang[0].panjang +
        " lebar: " + arrayOfPersegiPanjang[0].lebar);
        System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang[1].panjang +
        " lebar: " + arrayOfPersegiPanjang[1].lebar);
        System.out.println("Persegi panjang ke-3, panjang: " + arrayOfPersegiPanjang[2].panjang +
        ", lebar: " + arrayOfPersegiPanjang[2].lebar);
    }
}