import java.util.Scanner;

public class Kasir {
    int choice;
    boolean quit;
    int price;
    int[] price_item;
    String menu;
    String selected;
    int total;
    int input_item;
    int amount;
    int paying;
    int MedicineDetail;
    int methodPayment;
    int assuranceType;
    double Discon;
    double discountPercetage;
    int totHarga;
    double totDisount;
    int pembayaran;
    double change;

    public Kasir() {
        this.choice = 0;
        this.quit = false;
        this.price = 0;
        this.price_item = new int[] { 2000, 3500, 5900, 4000, 3300, 2500, 5000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000 };
        this.menu = null;
        this.selected = null;
        this.total = 0;
        this.input_item = 0;
        this.amount = 0;
        this.paying = 0;
        this.MedicineDetail = 0;
        this.methodPayment = 0;
        this.assuranceType = 0;
        this.Discon = 0;
        this.discountPercetage = 0;
        this.totHarga = 0;
        this.totDisount = 0;
        this.pembayaran = 0;
        this.change = 0;
    }

    public void tambilkanData() {
        System.out.println("Choice: " + choice);
        System.out.println("Quit: " + quit);
        System.out.println("Price: " + price);
        System.out.print("Price_Item: ");
        for (int i = 0; i < price_item.length; i++) {
            System.out.print(price_item[i] + " ");
        }
        System.out.println();
        System.out.println("Menu: " + menu);
        System.out.println("Selected: " + selected);
        System.out.println("Total: " + total);
        System.out.println("Input_Item: " + input_item);
        System.out.println("Amount: " + amount);
        System.out.println("Paying: " + paying);
        System.out.println("Medicinedetail: " + MedicineDetail);
        System.out.println("Methodpayment: " + methodPayment);
        System.out.println("Assurancetype: " + assuranceType);
        System.out.println("Discount: " + Discon);
        System.out.println("Discountpercentage: " + discountPercetage);
        System.out.println("Totharga: " + totHarga);
        System.out.println("Totdiscount: " + totDisount);
        System.out.println("Pembayaran: " + pembayaran);
        System.out.println("Change: " + change);
    }
}