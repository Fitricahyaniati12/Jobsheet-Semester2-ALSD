import java.util.Scanner;

public class PersegiPanjangDemo12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];
        int panjang, lebar;

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i+1));
            System.out.print("Masukkan panjang: ");
            panjang = input12.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = input12.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Persegi panjang ke-" + (i+1) + ", panjang: "
                    + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);

            System.out.println(", Luas: " + arrayOfPersegiPanjang[i].hitungLuas() + 
            ", Keliling: " + arrayOfPersegiPanjang[i].hitungKeliling());
        }
    }
}
