import java.util.Scanner;

public class PharmacyCasier {
    private int choice;
    private boolean quit;
    private int price;
    private int[] priceItem = new int[3];
    private String menu;
    private String selected;
    private int total;
    private int inputItem;
    private int amount;
    private int paying;
    private int medicinedetail;
    private String methodPayment;
    private int assuranceType;
    private double discount;
    private double discountPerList;
    private int totHarga;
    private double totDiscount;
    private int pembayaran;
    private double change;

    public PharmacyCasier() {
        this.choice = 0;
        this.quit = false;
        this.price = 0;
        this.menu = "";
        this.selected = "";
        this.total = 0;
        this.inputItem = 0;
        this.amount = 0;
        this.paying = 0;
        this.medicinedetail = 0;
        this.methodPayment = "";
        this.assuranceType = 0;
        this.discount = 0.0;
        this.discountPerList = 0.0;
        this.totHarga = 0;
        this.totDiscount = 0.0;
        this.pembayaran = 0;
        this.change = 0.0;
    }

    public void Menu() {
        System.out.println("Menu: ");
        // Implementasi menu
    }

    public void Medicinedetail(Scanner sc) {
        System.out.print("Medicine Detail: ");
        this.medicinedetail = sc.nextInt();
    }

    public void Purchaasetotal(Scanner sc) {
        System.out.print("Purchase Total: ");
        this.total = sc.nextInt();
    }

    public void Paymentmethod(Scanner sc) {
        System.out.print("Payment Method: ");
        this.methodPayment = sc.next();
    }

    public void Typeofassurance(Scanner sc) {
        System.out.print("Assurance Type: ");
        this.assuranceType = sc.nextInt();
    }

    public void Tampilankasir() {
        System.out.println("Choice: " + choice);
        System.out.println("Quit: " + quit);
        System.out.println("Price: " + price);
        System.out.println("Menu: " + menu);
        System.out.println("Selected: " + selected);
        System.out.println("Total: " + total);
        System.out.println("Input Item: " + inputItem);
        System.out.println("Amount: " + amount);
        System.out.println("Paying: " + paying);
        System.out.println("Medicine Detail: " + medicinedetail);
        System.out.println("Method Payment: " + methodPayment);
        System.out.println("Assurance Type: " + assuranceType);
        System.out.println("Discount: " + discount);
        System.out.println("Discount Per List: " + discountPerList);
        System.out.println("Total Harga: " + totHarga);
        System.out.println("Total Discount: " + totDiscount);
        System.out.println("Pembayaran: " + pembayaran);
        System.out.println("Change: " + change);
    }
}