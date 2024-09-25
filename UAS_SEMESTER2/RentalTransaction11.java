import java.util.List;

public class RentalTransaction11 {
    private static int transactionCodeCounter = 1;

    private int transactionCode;
    private String borrowerName;
    private String TNKBNumber;
    private int lengthOfLoan;
    private double totalCost;

    public RentalTransaction11(String borrowerName, String TNKBNumber, int lengthOfLoan, List<RentalItem11> rentalItems) {
        this.transactionCode = transactionCodeCounter++;
        this.borrowerName = borrowerName;
        this.TNKBNumber = TNKBNumber;
        this.lengthOfLoan = lengthOfLoan;
        this.totalCost = 0;
        calculateTotalCost(rentalItems);
    }

    private void calculateTotalCost(List<RentalItem11> rentalItems) {
        RentalItem11 vehicle = rentalItems.stream()
                                        .filter(item -> item.getTNKBNumber().equals(TNKBNumber))
                                        .findFirst()
                                        .orElse(null);

        if (vehicle != null) {
            int baseCost = vehicle.getRentalFee() * lengthOfLoan;
            double discount = 0;
            if (48 <= lengthOfLoan && lengthOfLoan < 78) {
                discount = 0.10;
            } else if (lengthOfLoan >= 78) {
                discount = 0.20;
            }
            totalCost = baseCost * (1 - discount);
        }
    }

    public int getTransactionCode() {
        return transactionCode;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public String getTNKBNumber() {
        return TNKBNumber;
    }

    public int getLengthOfLoan() {
        return lengthOfLoan;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getVehicleName(List<RentalItem11> rentalItems) {
        RentalItem11 vehicle = rentalItems.stream()
                                          .filter(item -> item.getTNKBNumber().equals(TNKBNumber))
                                          .findFirst()
                                          .orElse(null);
        return vehicle != null ? vehicle.getVehicleName() : "Unknown";
    }

    @Override
    public String toString() {
        return "Transaction Code: " + transactionCode + ", Borrower Name: " + borrowerName + ", TNKB Number: " + TNKBNumber + ", Length of Loan: " + lengthOfLoan + ", Total Cost: " + totalCost;
    }
}
