import java.util.Scanner;
import java.util.Stack;

public class DewiShopping {
    public static void main(String[] args) {
        Stack<Receipt> receiptStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Simulate Dewi keeping 8 receipts in the wardrobe
        for (int i = 1; i <= 8; i++) {
            Receipt receipt = new Receipt("T" + i, "2024-05-01", 3, 100000.0 * i);
            receiptStack.push(receipt);
        }

        System.out.println("Dewi has kept 8 receipts in the wardrobe.");

        // Simulate Dewi trading 5 receipts for a voucher
        System.out.println("Dewi plans to trade 5 receipts for a voucher.");
        for (int i = 1; i <= 5; i++) {
            Receipt tradedReceipt = receiptStack.pop();
            System.out.println("Traded Receipt: " + tradedReceipt);
        }

        // Display the remaining receipts in the wardrobe
        System.out.println("Remaining Receipts in the wardrobe:");
        for (Receipt receipt : receiptStack) {
            System.out.println(receipt);
        }

        scanner.close();
    }
}
