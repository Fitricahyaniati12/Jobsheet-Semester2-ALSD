import java.util.Scanner;

public class PharmacyCashier {
    private Scanner scanner;
    private int choice;
    private boolean quit;
    private int price;
    private int[] priceItem;
    private String menu;
    private String selected;
    private int total;
    private int inputItem;
    private int amount;
    private int paying;
    private int medicineDetail;
    private String methodPayment;
    private int assuranceType;
    private double discount;
    private double discountPerList;
    private int totalHarga;
    private double totDiscount;
    private int pembayaran;
    private double change;

    public PharmacyCashier() {
        scanner = new Scanner(System.in);
        priceItem = new int[10]; // assuming maximum 10 items
    }

    public void displayMenu() {
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. View Cart");
        System.out.println("4. Checkout");
        System.out.println("5. Quit");
    }

    public void addItem(int price) {
        System.out.println("Item added to cart.");
        priceItem[total++] = price;
    }

    public void removeItem(int index) {
        if (index >= 0 && index < total) {
            System.out.println("Item removed from cart.");
            for (int i = index; i < total - 1; i++) {
                priceItem[i] = priceItem[i + 1];
            }
            total--;
        } else {
            System.out.println("Invalid item index.");
        }
    }

    public void viewCart() {
        System.out.println("Cart Items:");
        for (int i = 0; i < total; i++) {
            System.out.println("Item " + (i + 1) + ": $" + priceItem[i]);
        }
    }

    public void checkout() {
        totalHarga = 0;
        for (int i = 0; i < total; i++) {
            totalHarga += priceItem[i];
        }
        totDiscount = totalHarga * discountPerList;
        totalHarga -= totDiscount;
        System.out.println("Total Price: $" + totalHarga);
    }

    public void payment() {
        System.out.print("Enter amount: $");
        pembayaran = scanner.nextInt();
        change = pembayaran - totalHarga;
        System.out.println("Change: $" + change);
    }

    public void run() {
        while (!quit) {
            displayMenu();
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter item price: $");
                    price = scanner.nextInt();
                    addItem(price);
                    break;
                case 2:
                    System.out.print("Enter item index to remove: ");
                    int index = scanner.nextInt();
                    removeItem(index - 1);
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    checkout();
                    payment();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
