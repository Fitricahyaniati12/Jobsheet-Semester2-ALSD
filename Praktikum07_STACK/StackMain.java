import java.util.Scanner;

public class StackMain {

    public static void main(String[] args) {
        Stack11 stk = new Stack11(5);
        Scanner sc = new Scanner(System.in);

        char pilihMenu;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu: ");
            pilihMenu = sc.next().charAt(0);
            sc.nextLine();

            switch (pilihMenu) {
                case '1':
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();
                    sc.nextLine();

                    Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case '2':
                    stk.pop();
                    break;
                case '3':
                    stk.peek();
                    break;
                case '4':
                    stk.print();
                    break;
                case '5':
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihMenu != '5');

        sc.close();
    }
}
