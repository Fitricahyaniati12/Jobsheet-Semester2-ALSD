class Receipt {
    private String transactionId;
    private String date;
    private int quantityOfItems;
    private double totalPrice;

    public Receipt(String transactionId, String date, int quantityOfItems, double totalPrice) {
        this.transactionId = transactionId;
        this.date = date;
        this.quantityOfItems = quantityOfItems;
        this.totalPrice = totalPrice;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getDate() {
        return date;
    }

    public int getQuantityOfItems() {
        return quantityOfItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Date: " + date + ", Quantity of Items: " + quantityOfItems
                + ", Total Price: " + totalPrice;
    }
}
