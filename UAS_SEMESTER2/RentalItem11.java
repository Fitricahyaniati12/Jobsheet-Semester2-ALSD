public class RentalItem11 {
    private String TNKBNumber;
    private String vehicleName;
    private String vehicleType;
    private int year;
    private int rentalFee;

    public RentalItem11(String TNKBNumber, String vehicleName, String vehicleType, int year, int rentalFee) {
        this.TNKBNumber = TNKBNumber;
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.year = year;
        this.rentalFee = rentalFee;
    }

    public String getTNKBNumber() {
        return TNKBNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getYear() {
        return year;
    }

    public int getRentalFee() {
        return rentalFee;
    }

    @Override
    public String toString() {
        return TNKBNumber + " | " + vehicleName + " | " + vehicleType + " | " + year + " | " + rentalFee;
    }
}
