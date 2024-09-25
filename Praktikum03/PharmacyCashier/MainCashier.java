import java.util.Scanner;

public class MainCashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        do {
            System.out.println("LOGGED IN WITH AN ACCOUNT?");
            System.out.println("1.Kasir");
            System.out.println("2.Manager");
            System.out.print("Choose (1/2) : ");
            int choose1 = scanner.nextInt();
            switch (choose1) {
                case 1:
                    Kasir.tamplianKasir();
                    break;
                case 2:
                    Manager.tampilanManager();
                    break;
                default:
                    quit = true;
                    break;
            }
        } while (!quit);

        scanner.close();
    }
}