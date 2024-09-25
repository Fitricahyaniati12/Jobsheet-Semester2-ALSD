/**
 * PersegiPanjang12
 */
public class PersegiPanjang12 {

    public static class PersegiPanjang {
        public int panjang;
        public int lebar;

        // Konstruktor dengan dua parameter
        public PersegiPanjang(int p, int l) {
            this.panjang = p;
            this.lebar = l;
        }

        // Method buat mencetak info persegi panjang
        public void cetakInfo() {
            System.out.println("Panjang: " + this.panjang);
            System.out.println("Lebar: " + this.lebar);
        }

        public int getPanjang() {
            return this.panjang;
        }

        public int getLebar() {
            return this.lebar;
        }

        public int hitungLuas() {
            return this.panjang * this.lebar;
        }

        public int hitungKeliling() {
            return 2 * (this.panjang + this.lebar);
        }
    }

    //public static void main(String[] args) {
      //  PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        //persegiPanjang.cetakInfo();
        //System.out.println("Luas: " + persegiPanjang.hitungLuas());
        //System.out.println("Keliling: " + persegiPanjang.hitungKeliling());
    }

