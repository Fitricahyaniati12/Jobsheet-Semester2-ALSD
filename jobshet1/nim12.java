import java.util.Scanner;

public class nim12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" masukkan NIM : "  );
        String Nim = sc.nextLine();

        int n = Integer.parseInt(Nim.substring(Nim.length() - 2));

        if (n < 10) {
            n += 10;
        }

        // Menampilkan hasil running program
        System.out.println("===================");
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }

        
            }

            }

        }

    }
